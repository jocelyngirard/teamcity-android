package com.erioxyde.android.teamcity;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;

import com.smartnsoft.droid4me.app.SmartActivity;
import com.smartnsoft.droid4me.framework.Commands;
import com.smartnsoft.droid4me.menu.StaticMenuCommand;

/**
 * The starting screen of the application.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class ProjectsActivity
    extends SmartActivity<TitleBar.TitleBarAggregate>
{

  public void onRetrieveDisplayObjects()
  {
    setContentView(R.layout.projects);
    // TODO Auto-generated method stub

  }

  public void onRetrieveBusinessObjects()
      throws BusinessObjectUnavailableException
  {
    // TODO Auto-generated method stub

  }

  public void onFulfillDisplayObjects()
  {
    // TODO Auto-generated method stub

  }

  public void onSynchronizeDisplayObjects()
  {
    // TODO Auto-generated method stub

  }

  @Override
  public List<StaticMenuCommand> getMenuCommands()
  {
    final List<StaticMenuCommand> commands = new ArrayList<StaticMenuCommand>();
    commands.add(new StaticMenuCommand(R.string.Projects_menu_settings, '1', 's', android.R.drawable.ic_menu_preferences, new Commands.StaticEnabledExecutable()
    {
      @Override
      public void run()
      {
        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
      }
    }));
    commands.add(new StaticMenuCommand(R.string.Projects_menu_about, '2', 'a', android.R.drawable.ic_menu_info_details, new Commands.StaticEnabledExecutable()
    {
      @Override
      public void run()
      {
        startActivity(new Intent(getApplicationContext(), AboutActivity.class));
      }
    }));
    return commands;
  }

}
