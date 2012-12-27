package com.erioxyde.android.teamcity;

import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.Window;

import com.erioxyde.android.teamcity.bo.Project;
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
public final class TeamCityAndroidSplashScreenActivity extends SmartSplashScreenActivity<Void> implements LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy, TeamCityInformations {

    private final static int MISSING_SD_CARD_DIALOG_ID = 0;

    public TeamCityCredentials getCredentials() {
        final String login = getPreferences().getString(TeamCityActivity.USER_LOGIN, null);
        final String password = getPreferences().getString(TeamCityActivity.USER_PASSWORD, null);
        return new TeamCityCredentials(login, password);
    }

    public String getServerURL() {
        return getPreferences().getString(TeamCityActivity.SERVER_URL, null);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == TeamCityAndroidSplashScreenActivity.MISSING_SD_CARD_DIALOG_ID) {
            return new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle(R.string.applicationName).setMessage(R.string.TeamCityAndroidSplashScreen_dialogMessage_noSdCard).setPositiveButton(android.R.string.ok, new OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).create();
        }
        return super.onCreateDialog(id);
    }

    @Override
    protected boolean requiresExternalStorage() {
        return true;
    }

    @Override
    protected void onNoExternalStorage() {
        showDialog(TeamCityAndroidSplashScreenActivity.MISSING_SD_CARD_DIALOG_ID);
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
    protected void onRetrieveBusinessObjectsCustom() throws BusinessObjectUnavailableException {
        if (TeamCityAndroidApplication.hasTeamCityInformations(this) == true) {
            TeamCityAndroidServices.getInstance().setTeamCityInformations(this);
            try {
                final List<Project> projects = TeamCityAndroidServices.getInstance().getProjects(true);
                for (Project project : projects) {
                    TeamCityAndroidServices.getInstance().getProject(true, project.id);
                }
            } catch (CacheException exception) {
                throw new BusinessObjectUnavailableException(exception);
            }

        }
        markAsInitialized();
    }

}
