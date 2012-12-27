package com.erioxyde.android.teamcity;

import java.util.List;

import android.view.MenuItem;
import android.widget.ListView;

import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityCredentials;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityInformations;
import com.smartnsoft.droid4me.LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy;
import com.smartnsoft.droid4me.app.AbstractWrappedSmartListActivity;
import com.smartnsoft.droid4me.framework.SmartAdapters.BusinessViewWrapper;

abstract public class TeamCityListActivity extends AbstractWrappedSmartListActivity<Void, ListView> implements BusinessObjectsRetrievalAsynchronousPolicy, TeamCityInformations {

    protected boolean fromCache = true;

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

    public List<? extends BusinessViewWrapper<?>> retrieveBusinessObjectsList() throws BusinessObjectUnavailableException {
        // TODO Auto-generated method stub
        return null;
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
