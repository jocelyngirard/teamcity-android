package com.erioxyde.android.teamcity;

import java.util.List;

import android.content.Intent;

import com.erioxyde.android.teamcity.fragments.ProjectsFragment;
import com.smartnsoft.droid4me.framework.Commands;
import com.smartnsoft.droid4me.menu.StaticMenuCommand;

/**
 * The starting screen of the application.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class ProjectsActivity extends TeamCityFragmentActivity
{
	public void onRetrieveBusinessObjects()
			throws BusinessObjectUnavailableException {
		getSupportFragmentManager().beginTransaction().add(android.R.id.content, new ProjectsFragment()).commit();
	}
	public void onFulfillDisplayObjects() {

	}

	public void onRetrieveDisplayObjects() {

	}

	public void onSynchronizeDisplayObjects() {

	}

    @Override
    public List<StaticMenuCommand> getMenuCommands() {
        final List<StaticMenuCommand> commands = super.getMenuCommands();
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

}
