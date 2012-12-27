package com.erioxyde.android.teamcity;

import android.content.pm.PackageManager.NameNotFoundException;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.view.MenuItem;

import com.smartnsoft.droid4me.app.SmartPreferenceActivity;

/**
 * The activity which enables to tune the application.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class SettingsActivity extends SmartPreferenceActivity<Void> implements OnPreferenceChangeListener, OnPreferenceClickListener {

    private Preference serverUrl;
    private Preference userLogin;
    private Preference userPassword;
    private Preference version;
    private Preference logout;

    @SuppressWarnings("deprecation")
    public void onRetrieveDisplayObjects() {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        addPreferencesFromResource(R.xml.settings);
        {
            serverUrl = findPreference(TeamCityActivity.SERVER_URL);
            userLogin = findPreference(TeamCityActivity.USER_LOGIN);
            userPassword = findPreference(TeamCityActivity.USER_PASSWORD);
            logout = findPreference("logout");
            version = findPreference("version");

            serverUrl.setOnPreferenceChangeListener(this);
            userLogin.setOnPreferenceChangeListener(this);
            userPassword.setOnPreferenceChangeListener(this);
            logout.setOnPreferenceClickListener(this);

            serverUrl.setSummary(getPreferences().getString(TeamCityActivity.SERVER_URL, ""));
            userLogin.setSummary(getPreferences().getString(TeamCityActivity.USER_LOGIN, ""));
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
        return computePassword(getPreferences().getString(TeamCityActivity.USER_PASSWORD, ""));
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
