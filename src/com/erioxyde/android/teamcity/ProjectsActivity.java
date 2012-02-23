package com.erioxyde.android.teamcity;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.widget.ListView;

import com.erioxyde.android.teamcity.bo.Project;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.smartnsoft.droid4me.app.AbstractWrappedSmartListActivity;
import com.smartnsoft.droid4me.cache.Values.CacheException;
import com.smartnsoft.droid4me.framework.Commands;
import com.smartnsoft.droid4me.framework.SmartAdapters;
import com.smartnsoft.droid4me.framework.SmartAdapters.BusinessViewWrapper;
import com.smartnsoft.droid4me.menu.StaticMenuCommand;

/**
 * The starting screen of the application.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class ProjectsActivity
    extends AbstractWrappedSmartListActivity<TitleBar.TitleBarAggregate, ListView>
{

  @Override
  public void onRetrieveDisplayObjects()
  {
    super.onRetrieveDisplayObjects();
  }

  public List<? extends BusinessViewWrapper<?>> retrieveBusinessObjectsList()
      throws BusinessObjectUnavailableException
  {
    final List<Project> projects;
    try
    {
      projects = TeamCityAndroidServices.getInstance().getProjects(true);
    }
    catch (CacheException exception)
    {
      throw new BusinessObjectUnavailableException(exception);
    }

    final List<BusinessViewWrapper<?>> wrappers = new ArrayList<SmartAdapters.BusinessViewWrapper<?>>();

    return wrappers;
  }

  @Override
  public void onFulfillDisplayObjects()
  {
    super.onFulfillDisplayObjects();
  }

  @Override
  public void onSynchronizeDisplayObjects()
  {
    super.onSynchronizeDisplayObjects();
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
    // commands.add(new StaticMenuCommand(R.string.Projects_menu_about, '2', 'a', android.R.drawable.ic_menu_info_details, new
    // Commands.StaticEnabledExecutable()
    // {
    // @Override
    // public void run()
    // {
    // startActivity(new Intent(getApplicationContext(), AboutActivity.class));
    // }
    // }));
    return commands;
  }

}
