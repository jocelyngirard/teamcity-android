package com.erioxyde.android.teamcity;

import java.util.HashSet;
import java.util.Set;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.Window;

import com.erioxyde.android.teamcity.bo.Project;
import com.erioxyde.android.teamcity.bo.Project.Projects;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityCredentials;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityInformations;
import com.smartnsoft.droid4me.LifeCycle;
import com.smartnsoft.droid4me.app.SmartSplashScreenActivity;
import com.smartnsoft.droid4me.cache.Values.CacheException;

/**
 * The first activity displayed while the application is loading.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class TeamCityAndroidSplashScreenActivity extends SmartSplashScreenActivity<Void, Void> implements LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy, TeamCityInformations {
 
    public TeamCityCredentials getCredentials() {
        final String login = getPreferences().getString(SettingsActivity.USER_LOGIN, null);
        final String password = getPreferences().getString(SettingsActivity.USER_PASSWORD, null);
        return new TeamCityCredentials(login, password);
    }

    public String getServerURL() {
        return getPreferences().getString(SettingsActivity.SERVER_URL, null);
    }


    @Override
    protected boolean requiresExternalStorage() {
        return true;
    }

	@Override
    protected void onNoExternalStorage() {
    	new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle(R.string.applicationName).setMessage(R.string.TeamCityAndroidSplashScreen_dialogMessage_noSdCard).setPositiveButton(android.R.string.ok, new OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).create().show();
    }

    @Override
    protected Class<? extends Activity> getNextActivity() {
        return ProjectsActivity.class;
    }

    @Override
    protected void onRetrieveDisplayObjectsCustom() {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(LayoutInflater.from(this).inflate(R.layout.teamcityandroid_splash_screen, null));
        setProgressBarIndeterminateVisibility(true);
    }

    @Override
    protected Void onRetrieveBusinessObjectsCustom() throws BusinessObjectUnavailableException {
        if (TeamCityAndroidApplication.hasTeamCityInformations(this) == true) {
            TeamCityAndroidServices.getInstance().setTeamCityInformations(this);
            final Set<String> hiddenProjects = getPreferences().getStringSet(SettingsActivity.HIDDEN_PROJECTS, new HashSet<String>());
            try {
                final Projects projects = TeamCityAndroidServices.getInstance().getProjects(true);
                for (Project project : projects.project) {
                    if (hiddenProjects.contains(project.id) == false) {
                        TeamCityAndroidServices.getInstance().getProject(true, project.id);
                    }
                }
            } catch (CacheException exception) {
                throw new BusinessObjectUnavailableException(exception);
            }

        }
        return null;
    }

}
