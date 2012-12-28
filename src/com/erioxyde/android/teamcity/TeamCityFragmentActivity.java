package com.erioxyde.android.teamcity;


import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityCredentials;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityInformations;
import com.smartnsoft.droid4me.LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy;
import com.smartnsoft.droid4me.app.AppPublics;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setProgressBarIndeterminateVisibility(Boolean.TRUE);
        super.onCreate(savedInstanceState);
    }

    public void onRetrieveBusinessObjects() throws BusinessObjectUnavailableException {
		TeamCityAndroidServices.getInstance().setTeamCityInformations(this);
	}

    @Override
    public List<StaticMenuCommand> getMenuCommands() {
        final List<StaticMenuCommand> commands = new ArrayList<StaticMenuCommand>();
        commands.add(new StaticMenuCommand(R.string.Projects_menu_settings, '2', 's', android.R.drawable.ic_menu_preferences, new Commands.StaticEnabledExecutable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        }));
        commands.add(new StaticMenuCommand(R.string.Projects_menu_about, '3', 'a', android.R.drawable.ic_menu_info_details, new Commands.StaticEnabledExecutable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            }
        }));
        return commands;
    }
	
	private void refreshBusinessObjectsAndDisplay() {
		sendBroadcast(new Intent(AppPublics.RELOAD_ACTION));
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
