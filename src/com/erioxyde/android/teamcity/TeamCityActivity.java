package com.erioxyde.android.teamcity;

import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityCredentials;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices.TeamCityInformations;
import com.smartnsoft.droid4me.LifeCycle.BusinessObjectsRetrievalAsynchronousPolicy;
import com.smartnsoft.droid4me.app.SmartActivity;

public abstract class TeamCityActivity
    extends SmartActivity<TitleBar.TitleBarAggregate>
    implements BusinessObjectsRetrievalAsynchronousPolicy, TeamCityInformations
{

  public static final String SERVER_URL = "serverUrl";

  public static final String USER_LOGIN = "userLogin";

  public static final String USER_PASSWORD = "userPassword";

  public TeamCityCredentials getCredentials()
  {
    final String login = getPreferences().getString(TeamCityActivity.USER_LOGIN, null);
    final String password = getPreferences().getString(TeamCityActivity.USER_PASSWORD, null);
    return new TeamCityCredentials(login, password);
  }

  public String getServerURL()
  {
    return getPreferences().getString(TeamCityActivity.SERVER_URL, null);
  }

  public void onRetrieveBusinessObjects()
      throws BusinessObjectUnavailableException
  {
    TeamCityAndroidServices.getInstance().setTeamCityInformations(this);
  }

}
