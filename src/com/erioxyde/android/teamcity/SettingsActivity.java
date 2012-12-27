package com.erioxyde.android.teamcity;

import android.content.pm.PackageManager.NameNotFoundException;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.view.MenuItem;

import com.erioxyde.android.teamcity.bo.Project.Projects;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.smartnsoft.droid4me.LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy;
import com.smartnsoft.droid4me.app.SmartPreferenceActivity;
import com.smartnsoft.droid4me.cache.Values.CacheException;

/**
 * The activity which enables to tune the application.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class SettingsActivity extends SmartPreferenceActivity<Void> implements BusinessObjectsRetrievalAsynchronousPolicy, OnPreferenceChangeListener, OnPreferenceClickListener {

    public static final String HIDDEN_PROJECTS = "projectsHidden";

    public static final String VERSION = "version";

    public static final String LOGOUT = "logout";

    public static final String SERVER_URL = "serverUrl";

    public static final String USER_LOGIN = "userLogin";

    public static final String USER_PASSWORD = "userPassword";

    private Preference serverUrl;

    private Preference userLogin;

    private Preference userPassword;

    private Preference version;

    private Preference logout;

    private MultiSelectListPreference hiddenProjects;

    private Projects projects;

    @SuppressWarnings("deprecation")
    public void onRetrieveDisplayObjects() {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        addPreferencesFromResource(R.xml.settings);
        {
            hiddenProjects = (MultiSelectListPreference) findPreference(SettingsActivity.HIDDEN_PROJECTS);
            serverUrl = findPreference(SettingsActivity.SERVER_URL);
            userLogin = findPreference(SettingsActivity.USER_LOGIN);
            userPassword = findPreference(SettingsActivity.USER_PASSWORD);
            logout = findPreference(SettingsActivity.LOGOUT);
            version = findPreference(SettingsActivity.VERSION);

            serverUrl.setOnPreferenceChangeListener(this);
            userLogin.setOnPreferenceChangeListener(this);
            userPassword.setOnPreferenceChangeListener(this);
            logout.setOnPreferenceClickListener(this);

            serverUrl.setSummary(getPreferences().getString(SettingsActivity.SERVER_URL, ""));
            userLogin.setSummary(getPreferences().getString(SettingsActivity.USER_LOGIN, ""));
            userPassword.setSummary(computePassword());

            try {
                version.setSummary(getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
            } catch (NameNotFoundException exception) {
                if (log.isErrorEnabled()) {
                    log.error("Cannot determine the application version name", exception);
                }
                version.setSummary("???");
            }
        }
    }

    @Override
    public void onRetrieveBusinessObjects() throws BusinessObjectUnavailableException {
        super.onRetrieveBusinessObjects();
        try {
            projects = TeamCityAndroidServices.getInstance().getProjects(true);
        } catch (CacheException exception) {
            throw new BusinessObjectUnavailableException(exception);
        }
        hiddenProjects.setEntries(projects.getProjectsNames());
        hiddenProjects.setEntryValues(projects.getProjectsIds());
        hiddenProjects.setEnabled(true);
    }

    public boolean onPreferenceChange(Preference preference, Object newValue) {
        if (preference == serverUrl) {
            serverUrl.setSummary((String) newValue);
        } else if (preference == userLogin) {
            userLogin.setSummary((String) newValue);
        } else if (preference == userPassword) {
            userPassword.setSummary(computePassword((String) newValue));
        }
        return true;
    }

    private String computePassword() {
        return computePassword(getPreferences().getString(SettingsActivity.USER_PASSWORD, ""));
    }

    private String computePassword(String password) {
        final StringBuilder sbBuilder = new StringBuilder();
        for (int index = 0; index < password.length(); index++) {
            sbBuilder.append("*");
        }
        return sbBuilder.toString();
    }

    public boolean onPreferenceClick(Preference preference) {
        if (preference == logout) {
            getPreferences().edit().clear().commit();
            // System.runFinalizersOnExit(true);
            System.exit(0);
        }
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
        case android.R.id.home:
            finish();
            break;
        }
        return super.onMenuItemSelected(featureId, item);
    }

}
