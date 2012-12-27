package com.erioxyde.android.teamcity;


import java.util.ArrayList;
import java.util.List;

import com.actionbarsherlock.view.MenuItem;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityCredentials;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityInformations;
import com.smartnsoft.droid4me.LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy;
import com.smartnsoft.droid4me.framework.Commands;
import com.smartnsoft.droid4me.menu.StaticMenuCommand;
import com.smartnsoft.droid4me.support.v4.app.SmartFragmentActivity;
import com.smartnsoft.droid4me.support.v4.menu.ActionMenuCommand;

public abstract class TeamCityFragmentActivity extends SmartFragmentActivity<Void> implements BusinessObjectsRetrievalAsynchronousPolicy, TeamCityInformations {

	public boolean fromCache = true;

	public TeamCityCredentials getCredentials() {
		final String login = getPreferences().getString(SettingsActivity.USER_LOGIN, null);
		final String password = getPreferences().getString(SettingsActivity.USER_PASSWORD, null);
		return new TeamCityCredentials(login, password);
	}

	public String getServerURL() {
		return getPreferences().getString(SettingsActivity.SERVER_URL, null);
	}

	public void onRetrieveBusinessObjects() throws BusinessObjectUnavailableException {
		TeamCityAndroidServices.getInstance().setTeamCityInformations(this);
	}

	
	
    @Override
    public List<StaticMenuCommand> getMenuCommands() {
        final List<StaticMenuCommand> commands = new ArrayList<StaticMenuCommand>();
        commands.add(new ActionMenuCommand(R.string.Projects_menu_refresh, '1', 'r', android.R.drawable.ic_menu_rotate, MenuItem.SHOW_AS_ACTION_ALWAYS, new Commands.StaticEnabledExecutable() {
			@Override
            public void run() {
                fromCache = false;
                refreshBusinessObjectsAndDisplay();
            }
        }));
        return commands;
    }
	
	private void refreshBusinessObjectsAndDisplay() {
		refreshBusinessObjectsAndDisplay(true, null, true);
	}
	
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		int itemId = item.getItemId();
		switch (itemId) {
		case android.R.id.home:
			finish();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
