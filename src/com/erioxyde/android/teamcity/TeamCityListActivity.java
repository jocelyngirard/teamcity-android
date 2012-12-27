package com.erioxyde.android.teamcity;

import android.widget.ListView;

import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityCredentials;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityInformations;
import com.smartnsoft.droid4me.LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy;
import com.smartnsoft.droid4me.app.AbstractWrappedSmartListActivity;

abstract public class TeamCityListActivity extends AbstractWrappedSmartListActivity<Void, ListView> implements BusinessObjectsRetrievalAsynchronousPolicy, TeamCityInformations {

    public TeamCityCredentials getCredentials() {
        final String login = getPreferences().getString(TeamCityActivity.USER_LOGIN, null);
        final String password = getPreferences().getString(TeamCityActivity.USER_PASSWORD, null);
        return new TeamCityCredentials(login, password);
    }

    public String getServerURL() {
        return getPreferences().getString(TeamCityActivity.SERVER_URL, null);
    }

    @Override
    public void onRetrieveDisplayObjects() {
        super.onRetrieveDisplayObjects();
        TeamCityAndroidServices.getInstance().setTeamCityInformations(this);
    }

}
