package com.erioxyde.android.teamcity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.erioxyde.android.teamcity.bo.Project;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.smartnsoft.droid4me.cache.Values.CacheException;
import com.smartnsoft.droid4me.framework.Commands;
import com.smartnsoft.droid4me.framework.SmartAdapters;
import com.smartnsoft.droid4me.framework.SmartAdapters.BusinessViewWrapper;
import com.smartnsoft.droid4me.framework.SmartAdapters.SimpleBusinessViewWrapper;
import com.smartnsoft.droid4me.menu.StaticMenuCommand;

/**
 * The starting screen of the application.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class ProjectsActivity
    extends TeamCityListActivity
{

  public static final class ProjectAttributes
  {

    private final TextView text1;

    private final TextView text2;

    public ProjectAttributes(View view)
    {
      text1 = (TextView) view.findViewById(android.R.id.text1);
      text2 = (TextView) view.findViewById(android.R.id.text2);
    }

    public void update(Project businessObject)
    {
      text1.setText(businessObject.name);
      text2.setText(businessObject.id);
    }

  }

  private final static class ProjectWrapper
      extends SimpleBusinessViewWrapper<Project>
  {

    public ProjectWrapper(Project businessObject)
    {
      super(businessObject, 0, android.R.layout.simple_list_item_2);
    }

    @Override
    protected Object extractNewViewAttributes(Activity activity, View view, Project businessObject)
    {
      return new ProjectAttributes(view);
    }

    @Override
    protected void updateView(Activity activity, Object viewAttributes, View view, Project businessObject, int position)
    {
      ((ProjectAttributes) viewAttributes).update(businessObject);
    }

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

    for (Project project : projects)
    {
      wrappers.add(new ProjectWrapper(project));
    }

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
