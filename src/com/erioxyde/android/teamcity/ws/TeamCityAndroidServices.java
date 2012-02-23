package com.erioxyde.android.teamcity.ws;

import com.erioxyde.android.teamcity.Constants;

import com.smartnsoft.droid4me.ws.WebServiceCaller;

/**
 * A single point of access to the web services.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class TeamCityAndroidServices
    extends WebServiceCaller
{

  private static volatile TeamCityAndroidServices instance;

  // We accept the "out-of-order writes" case
  public static TeamCityAndroidServices getInstance()
  {
    if (instance == null)
    {
      synchronized (TeamCityAndroidServices.class)
      {
        if (instance == null)
        {
          instance = new TeamCityAndroidServices();
        }
      }
    }
    return instance;
  }

  private TeamCityAndroidServices()
  {
  }

  @Override
  protected String getUrlEncoding()
  {
    return Constants.WEBSERVICES_HTML_ENCODING;
  }

}
