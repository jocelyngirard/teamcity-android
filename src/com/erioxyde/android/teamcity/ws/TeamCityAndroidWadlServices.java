package com.erioxyde.android.teamcity.ws;

import java.util.HashMap;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

/**
 * 
 */
public class TeamCityAndroidWadlServices
{

  public static TeamCityAndroidWadlServices.AppRestUsers appRestUsers(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestUsers(client);
  }

  public static TeamCityAndroidWadlServices.AppRestUsers appRestUsers()
  {
    return appRestUsers(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestServer appRestServer(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestServer(client);
  }

  public static TeamCityAndroidWadlServices.AppRestServer appRestServer()
  {
    return appRestServer(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestChanges appRestChanges(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestChanges(client);
  }

  public static TeamCityAndroidWadlServices.AppRestChanges appRestChanges()
  {
    return appRestChanges(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRest appRest(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRest(client);
  }

  public static TeamCityAndroidWadlServices.AppRest appRest()
  {
    return appRest(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestAgents appRestAgents(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestAgents(client);
  }

  public static TeamCityAndroidWadlServices.AppRestAgents appRestAgents()
  {
    return appRestAgents(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestUserGroups appRestUserGroups(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestUserGroups(client);
  }

  public static TeamCityAndroidWadlServices.AppRestUserGroups appRestUserGroups()
  {
    return appRestUserGroups(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestVcsRoots appRestVcsRoots(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestVcsRoots(client);
  }

  public static TeamCityAndroidWadlServices.AppRestVcsRoots appRestVcsRoots()
  {
    return appRestVcsRoots(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestBuildTypes appRestBuildTypes(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestBuildTypes(client);
  }

  public static TeamCityAndroidWadlServices.AppRestBuildTypes appRestBuildTypes()
  {
    return appRestBuildTypes(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestProjects appRestProjects(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestProjects(client);
  }

  public static TeamCityAndroidWadlServices.AppRestProjects appRestProjects()
  {
    return appRestProjects(Client.create());
  }

  public static TeamCityAndroidWadlServices.AppRestBuilds appRestBuilds(Client client)
  {
    return new TeamCityAndroidWadlServices.AppRestBuilds(client);
  }

  public static TeamCityAndroidWadlServices.AppRestBuilds appRestBuilds()
  {
    return appRestBuilds(Client.create());
  }

  public static class AppRest
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRest(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRest()
    {
      this(Client.create());
    }

    public <T> T getAsTextPlain(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("text/plain");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsTextPlain(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("text/plain");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRest.Version version()
    {
      return new TeamCityAndroidWadlServices.AppRest.Version(_client);
    }

    public TeamCityAndroidWadlServices.AppRest.Info info()
    {
      return new TeamCityAndroidWadlServices.AppRest.Info(_client);
    }

    public TeamCityAndroidWadlServices.AppRest.ProjectLocatorBtLocatorBuildLocatorField projectLocatorBtLocatorBuildLocatorField(String projectlocator,
        String btlocator, String buildlocator, String field)
    {
      return new TeamCityAndroidWadlServices.AppRest.ProjectLocatorBtLocatorBuildLocatorField(_client, projectlocator, btlocator, buildlocator, field);
    }

    public static class Info
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public Info(Client client)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest");
        _uriBuilder = _uriBuilder.path("/info");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      /**
       * Create new instance
       * 
       */
      public Info()
      {
        this(Client.create());
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorBtLocatorBuildLocatorField
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorBtLocatorBuildLocatorField(Client client, String projectlocator, String btlocator, String buildlocator, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/{btLocator}/{buildLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorBtLocatorBuildLocatorField(String projectlocator, String btlocator, String buildlocator, String field)
      {
        this(Client.create(), projectlocator, btlocator, buildlocator, field);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRest.ProjectLocatorBtLocatorBuildLocatorField setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRest.ProjectLocatorBtLocatorBuildLocatorField setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRest.ProjectLocatorBtLocatorBuildLocatorField setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRest.ProjectLocatorBtLocatorBuildLocatorField setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class Version
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public Version(Client client)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest");
        _uriBuilder = _uriBuilder.path("/version");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      /**
       * Create new instance
       * 
       */
      public Version()
      {
        this(Client.create());
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

  }

  public static class AppRestAgents
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestAgents(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/agents");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestAgents()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Boolean includedisconnected, Boolean includeunauthorized, GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("includeDisconnected", includedisconnected);
      localUriBuilder = localUriBuilder.queryParam("includeUnauthorized", includeunauthorized);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Boolean includedisconnected, Boolean includeunauthorized, Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("includeDisconnected", includedisconnected);
      localUriBuilder = localUriBuilder.queryParam("includeUnauthorized", includeunauthorized);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Boolean includedisconnected, Boolean includeunauthorized, GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("includeDisconnected", includedisconnected);
      localUriBuilder = localUriBuilder.queryParam("includeUnauthorized", includeunauthorized);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Boolean includedisconnected, Boolean includeunauthorized, Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("includeDisconnected", includedisconnected);
      localUriBuilder = localUriBuilder.queryParam("includeUnauthorized", includeunauthorized);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestAgents.AgentLocator agentLocator(String agentlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestAgents.AgentLocator(_client, agentlocator);
    }

    public static class AgentLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public AgentLocator(Client client, String agentlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/agents");
        _uriBuilder = _uriBuilder.path("/{agentLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("agentLocator", agentlocator);
      }

      /**
       * Create new instance
       * 
       */
      public AgentLocator(String agentlocator)
      {
        this(Client.create(), agentlocator);
      }

      /**
       * Get agentLocator
       * 
       */
      public String getAgentlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("agentLocator"));
      }

      /**
       * Set agentLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestAgents.AgentLocator setAgentlocator(String agentlocator)
      {
        _templateAndMatrixParameterValues.put("agentLocator", agentlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

  }

  public static class AppRestBuilds
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestBuilds(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/builds");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestBuilds()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(String buildtype, String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled,
        Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator,
        GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("status", status);
      localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
      localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
      localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
      localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
      localUriBuilder = localUriBuilder.queryParam("tag", tag);
      localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
      localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
      localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      localUriBuilder = localUriBuilder.queryParam("locator", locator);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(String buildtype, String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled,
        Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("status", status);
      localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
      localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
      localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
      localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
      localUriBuilder = localUriBuilder.queryParam("tag", tag);
      localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
      localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
      localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      localUriBuilder = localUriBuilder.queryParam("locator", locator);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(String buildtype, String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled,
        Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator,
        GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("status", status);
      localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
      localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
      localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
      localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
      localUriBuilder = localUriBuilder.queryParam("tag", tag);
      localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
      localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
      localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      localUriBuilder = localUriBuilder.queryParam("locator", locator);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(String buildtype, String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled,
        Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("status", status);
      localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
      localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
      localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
      localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
      localUriBuilder = localUriBuilder.queryParam("tag", tag);
      localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
      localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
      localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      localUriBuilder = localUriBuilder.queryParam("locator", locator);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocator buildLocator(String buildlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuilds.BuildLocator(_client, buildlocator);
    }

    public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorField buildLocatorField(String buildlocator, String field)
    {
      return new TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorField(_client, buildlocator, field);
    }

    public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorStatistics buildLocatorStatistics(String buildlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorStatistics(_client, buildlocator);
    }

    public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorStatisticsName buildLocatorStatisticsName(String buildlocator, String name)
    {
      return new TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorStatisticsName(_client, buildlocator, name);
    }

    public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorTags buildLocatorTags(String buildlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorTags(_client, buildlocator);
    }

    public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorPin buildLocatorPin(String buildlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorPin(_client, buildlocator);
    }

    public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorComment buildLocatorComment(String buildlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorComment(_client, buildlocator);
    }

    public static class BuildLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BuildLocator(Client client, String buildlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/builds");
        _uriBuilder = _uriBuilder.path("/{buildLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BuildLocator(String buildlocator)
      {
        this(Client.create(), buildlocator);
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocator setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      public void deleteAsvoid()
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder.method("DELETE", Void.class);
      }

      public <T> T delete(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T delete(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BuildLocatorComment
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BuildLocatorComment(Client client, String buildlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/builds");
        _uriBuilder = _uriBuilder.path("/{buildLocator}/comment");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BuildLocatorComment(String buildlocator)
      {
        this(Client.create(), buildlocator);
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorComment setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      public <T> T putTextPlain(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("text/plain");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putTextPlain(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("text/plain");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public void deleteAsvoid()
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder.method("DELETE", Void.class);
      }

      public <T> T delete(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T delete(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

    }

    public static class BuildLocatorField
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BuildLocatorField(Client client, String buildlocator, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/builds");
        _uriBuilder = _uriBuilder.path("/{buildLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public BuildLocatorField(String buildlocator, String field)
      {
        this(Client.create(), buildlocator, field);
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorField setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorField setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BuildLocatorPin
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BuildLocatorPin(Client client, String buildlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/builds");
        _uriBuilder = _uriBuilder.path("/{buildLocator}/pin/");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BuildLocatorPin(String buildlocator)
      {
        this(Client.create(), buildlocator);
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorPin setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T putTextPlain(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("text/plain");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putTextPlain(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("text/plain");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T deleteTextPlain(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T deleteTextPlain(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

    }

    public static class BuildLocatorStatistics
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BuildLocatorStatistics(Client client, String buildlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/builds");
        _uriBuilder = _uriBuilder.path("/{buildLocator}/statistics/");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BuildLocatorStatistics(String buildlocator)
      {
        this(Client.create(), buildlocator);
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorStatistics setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BuildLocatorStatisticsName
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BuildLocatorStatisticsName(Client client, String buildlocator, String name)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/builds");
        _uriBuilder = _uriBuilder.path("/{buildLocator}/statistics/{name}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        _templateAndMatrixParameterValues.put("name", name);
      }

      /**
       * Create new instance
       * 
       */
      public BuildLocatorStatisticsName(String buildlocator, String name)
      {
        this(Client.create(), buildlocator, name);
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorStatisticsName setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      /**
       * Get name
       * 
       */
      public String getName()
      {
        return ((String) _templateAndMatrixParameterValues.get("name"));
      }

      /**
       * Set name
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorStatisticsName setName(String name)
      {
        _templateAndMatrixParameterValues.put("name", name);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BuildLocatorTags
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BuildLocatorTags(Client client, String buildlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/builds");
        _uriBuilder = _uriBuilder.path("/{buildLocator}/tags/");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BuildLocatorTags(String buildlocator)
      {
        this(Client.create(), buildlocator);
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuilds.BuildLocatorTags setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T putApplicationXml(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationXml(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T postApplicationXml(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("POST", returnType, input);
      }

      public <T> T postApplicationXml(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("POST", returnType, input);
      }

      public <T> T postApplicationJson(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("POST", returnType, input);
      }

      public <T> T postApplicationJson(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("POST", returnType, input);
      }

      public <T> T postTextPlain(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("text/plain");
        return resourceBuilder.method("POST", returnType, input);
      }

      public <T> T postTextPlain(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("text/plain");
        return resourceBuilder.method("POST", returnType, input);
      }

    }

  }

  public static class AppRestBuildTypes
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestBuildTypes(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestBuildTypes()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocator btLocator(String btlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocator(_client, btlocator);
    }

    public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorField btLocatorField(String btlocator, String field)
    {
      return new TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorField(_client, btlocator, field);
    }

    public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorParametersName btLocatorParametersName(String btlocator, String name)
    {
      return new TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorParametersName(_client, btlocator, name);
    }

    public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorRunParametersName btLocatorRunParametersName(String btlocator, String name)
    {
      return new TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorRunParametersName(_client, btlocator, name);
    }

    public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuilds btLocatorBuilds(String btlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuilds(_client, btlocator);
    }

    public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocator btLocatorBuildsBuildLocator(String btlocator, String buildlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocator(_client, btlocator, buildlocator);
    }

    public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField btLocatorBuildsBuildLocatorField(String btlocator,
        String buildlocator, String field)
    {
      return new TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField(_client, btlocator, buildlocator, field);
    }

    public static class BtLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BtLocator(Client client, String btlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
        _uriBuilder = _uriBuilder.path("/{btLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BtLocator(String btlocator)
      {
        this(Client.create(), btlocator);
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocator setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BtLocatorBuilds
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BtLocatorBuilds(Client client, String btlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
        _uriBuilder = _uriBuilder.path("/{btLocator}/builds");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BtLocatorBuilds(String btlocator)
      {
        this(Client.create(), btlocator);
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuilds setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag,
          String agentname, String sincebuild, String sincedate, Long start, Integer count, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag,
          String agentname, String sincebuild, String sincedate, Long start, Integer count, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned,
          String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned,
          String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BtLocatorBuildsBuildLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BtLocatorBuildsBuildLocator(Client client, String btlocator, String buildlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
        _uriBuilder = _uriBuilder.path("/{btLocator}/builds/{buildLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance
       * 
       */
      public BtLocatorBuildsBuildLocator(String btlocator, String buildlocator)
      {
        this(Client.create(), btlocator, buildlocator);
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocator setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocator setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BtLocatorBuildsBuildLocatorField
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BtLocatorBuildsBuildLocatorField(Client client, String btlocator, String buildlocator, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
        _uriBuilder = _uriBuilder.path("/{btLocator}/builds/{buildLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public BtLocatorBuildsBuildLocatorField(String btlocator, String buildlocator, String field)
      {
        this(Client.create(), btlocator, buildlocator, field);
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BtLocatorField
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BtLocatorField(Client client, String btlocator, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
        _uriBuilder = _uriBuilder.path("/{btLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public BtLocatorField(String btlocator, String field)
      {
        this(Client.create(), btlocator, field);
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorField setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorField setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class BtLocatorParametersName
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BtLocatorParametersName(Client client, String btlocator, String name)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
        _uriBuilder = _uriBuilder.path("/{btLocator}/parameters/{name}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("name", name);
      }

      /**
       * Create new instance
       * 
       */
      public BtLocatorParametersName(String btlocator, String name)
      {
        this(Client.create(), btlocator, name);
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorParametersName setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get name
       * 
       */
      public String getName()
      {
        return ((String) _templateAndMatrixParameterValues.get("name"));
      }

      /**
       * Set name
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorParametersName setName(String name)
      {
        _templateAndMatrixParameterValues.put("name", name);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T put(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("*/*");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T put(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("*/*");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public void deleteAsvoid()
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder.method("DELETE", Void.class);
      }

      public <T> T delete(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T delete(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

    }

    public static class BtLocatorRunParametersName
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public BtLocatorRunParametersName(Client client, String btlocator, String name)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
        _uriBuilder = _uriBuilder.path("/{btLocator}/runParameters/{name}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("name", name);
      }

      /**
       * Create new instance
       * 
       */
      public BtLocatorRunParametersName(String btlocator, String name)
      {
        this(Client.create(), btlocator, name);
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorRunParametersName setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get name
       * 
       */
      public String getName()
      {
        return ((String) _templateAndMatrixParameterValues.get("name"));
      }

      /**
       * Set name
       * 
       */
      public TeamCityAndroidWadlServices.AppRestBuildTypes.BtLocatorRunParametersName setName(String name)
      {
        _templateAndMatrixParameterValues.put("name", name);
        return this;
      }

      public <T> T put(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("*/*");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T put(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("*/*");
        return resourceBuilder.method("PUT", returnType, input);
      }

    }

  }

  public static class AppRestChanges
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestChanges(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/changes");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestChanges()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count,
        GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("project", project);
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("build", build);
      localUriBuilder = localUriBuilder.queryParam("vcsRoot", vcsroot);
      localUriBuilder = localUriBuilder.queryParam("sinceChange", sincechange);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count,
        Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("project", project);
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("build", build);
      localUriBuilder = localUriBuilder.queryParam("vcsRoot", vcsroot);
      localUriBuilder = localUriBuilder.queryParam("sinceChange", sincechange);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count,
        GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("project", project);
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("build", build);
      localUriBuilder = localUriBuilder.queryParam("vcsRoot", vcsroot);
      localUriBuilder = localUriBuilder.queryParam("sinceChange", sincechange);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count,
        Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.queryParam("project", project);
      localUriBuilder = localUriBuilder.queryParam("buildType", buildtype);
      localUriBuilder = localUriBuilder.queryParam("build", build);
      localUriBuilder = localUriBuilder.queryParam("vcsRoot", vcsroot);
      localUriBuilder = localUriBuilder.queryParam("sinceChange", sincechange);
      localUriBuilder = localUriBuilder.queryParam("start", start);
      localUriBuilder = localUriBuilder.queryParam("count", count);
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestChanges.ChangeLocator changeLocator(String changelocator)
    {
      return new TeamCityAndroidWadlServices.AppRestChanges.ChangeLocator(_client, changelocator);
    }

    public static class ChangeLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ChangeLocator(Client client, String changelocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/changes");
        _uriBuilder = _uriBuilder.path("/{changeLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("changeLocator", changelocator);
      }

      /**
       * Create new instance
       * 
       */
      public ChangeLocator(String changelocator)
      {
        this(Client.create(), changelocator);
      }

      /**
       * Get changeLocator
       * 
       */
      public String getChangelocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
      }

      /**
       * Set changeLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestChanges.ChangeLocator setChangelocator(String changelocator)
      {
        _templateAndMatrixParameterValues.put("changeLocator", changelocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

  }

  public static class AppRestProjects
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestProjects(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/projects");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestProjects()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds projectLocatorBuildTypesBtLocatorBuilds(String projectlocator,
        String btlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds(_client, projectlocator, btlocator);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator projectLocatorBuildTypesBtLocatorBuildsBuildLocator(
        String projectlocator, String btlocator, String buildlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, projectlocator, btlocator, buildlocator);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocator projectLocator(String projectlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocator(_client, projectlocator);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorField projectLocatorField(String projectlocator, String field)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorField(_client, projectlocator, field);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypes projectLocatorBuildTypes(String projectlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypes(_client, projectlocator);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocator projectLocatorBuildTypesBtLocator(String projectlocator,
        String btlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocator(_client, projectlocator, btlocator);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField projectLocatorBuildTypesBtLocatorField(String projectlocator,
        String btlocator, String field)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField(_client, projectlocator, btlocator, field);
    }

    public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField projectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(
        String projectlocator, String btlocator, String buildlocator, String field)
    {
      return new TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, projectlocator, btlocator, buildlocator, field);
    }

    public static class ProjectLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocator(Client client, String projectlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocator(String projectlocator)
      {
        this(Client.create(), projectlocator);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocator setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorBuildTypes
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorBuildTypes(Client client, String projectlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorBuildTypes(String projectlocator)
      {
        this(Client.create(), projectlocator);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypes setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocator(Client client, String projectlocator, String btlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocator(String projectlocator, String btlocator)
      {
        this(Client.create(), projectlocator, btlocator);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocator setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocator setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocatorBuilds
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorBuilds(Client client, String projectlocator, String btlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/builds");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorBuilds(String projectlocator, String btlocator)
      {
        this(Client.create(), projectlocator, btlocator);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag,
          String agentname, String sincebuild, String sincedate, Long start, Integer count, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag,
          String agentname, String sincebuild, String sincedate, Long start, Integer count, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned,
          String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned,
          String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("status", status);
        localUriBuilder = localUriBuilder.queryParam("triggeredByUser", triggeredbyuser);
        localUriBuilder = localUriBuilder.queryParam("includePersonal", includepersonal);
        localUriBuilder = localUriBuilder.queryParam("includeCanceled", includecanceled);
        localUriBuilder = localUriBuilder.queryParam("onlyPinned", onlypinned);
        localUriBuilder = localUriBuilder.queryParam("tag", tag);
        localUriBuilder = localUriBuilder.queryParam("agentName", agentname);
        localUriBuilder = localUriBuilder.queryParam("sinceBuild", sincebuild);
        localUriBuilder = localUriBuilder.queryParam("sinceDate", sincedate);
        localUriBuilder = localUriBuilder.queryParam("start", start);
        localUriBuilder = localUriBuilder.queryParam("count", count);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(Client client, String projectlocator, String btlocator, String buildlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(String projectlocator, String btlocator, String buildlocator)
      {
        this(Client.create(), projectlocator, btlocator, buildlocator);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(Client client, String projectlocator, String btlocator, String buildlocator, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(String projectlocator, String btlocator, String buildlocator, String field)
      {
        this(Client.create(), projectlocator, btlocator, buildlocator, field);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get buildLocator
       * 
       */
      public String getBuildlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
      }

      /**
       * Set buildLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setBuildlocator(String buildlocator)
      {
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        return this;
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocatorField
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorField(Client client, String projectlocator, String btlocator, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorBuildTypesBtLocatorField(String projectlocator, String btlocator, String field)
      {
        this(Client.create(), projectlocator, btlocator, field);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      /**
       * Get btLocator
       * 
       */
      public String getBtlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("btLocator"));
      }

      /**
       * Set btLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField setBtlocator(String btlocator)
      {
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        return this;
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class ProjectLocatorField
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public ProjectLocatorField(Client client, String projectlocator, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/projects");
        _uriBuilder = _uriBuilder.path("/{projectLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public ProjectLocatorField(String projectlocator, String field)
      {
        this(Client.create(), projectlocator, field);
      }

      /**
       * Get projectLocator
       * 
       */
      public String getProjectlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
      }

      /**
       * Set projectLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorField setProjectlocator(String projectlocator)
      {
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        return this;
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRestProjects.ProjectLocatorField setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

  }

  public static class AppRestServer
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestServer(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/server");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestServer()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestServer.Backup backup()
    {
      return new TeamCityAndroidWadlServices.AppRestServer.Backup(_client);
    }

    public TeamCityAndroidWadlServices.AppRestServer.Field field(String field)
    {
      return new TeamCityAndroidWadlServices.AppRestServer.Field(_client, field);
    }

    public TeamCityAndroidWadlServices.AppRestServer.Plugins plugins()
    {
      return new TeamCityAndroidWadlServices.AppRestServer.Plugins(_client);
    }

    public static class Backup
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public Backup(Client client)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/server");
        _uriBuilder = _uriBuilder.path("/backup");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      /**
       * Create new instance
       * 
       */
      public Backup()
      {
        this(Client.create());
      }

      public <T> T postAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("POST", returnType);
      }

      public <T> T postAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("POST", returnType);
      }

      public <T> T postAsTextPlain(String filename, Boolean addtimestamp, Boolean includeconfigs, Boolean includedatabase, Boolean includebuildlogs,
          Boolean includepersonalchanges, String param, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("fileName", filename);
        localUriBuilder = localUriBuilder.queryParam("addTimestamp", addtimestamp);
        localUriBuilder = localUriBuilder.queryParam("includeConfigs", includeconfigs);
        localUriBuilder = localUriBuilder.queryParam("includeDatabase", includedatabase);
        localUriBuilder = localUriBuilder.queryParam("includeBuildLogs", includebuildlogs);
        localUriBuilder = localUriBuilder.queryParam("includePersonalChanges", includepersonalchanges);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("POST", returnType);
      }

      public <T> T postAsTextPlain(String filename, Boolean addtimestamp, Boolean includeconfigs, Boolean includedatabase, Boolean includebuildlogs,
          Boolean includepersonalchanges, String param, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        localUriBuilder = localUriBuilder.queryParam("fileName", filename);
        localUriBuilder = localUriBuilder.queryParam("addTimestamp", addtimestamp);
        localUriBuilder = localUriBuilder.queryParam("includeConfigs", includeconfigs);
        localUriBuilder = localUriBuilder.queryParam("includeDatabase", includedatabase);
        localUriBuilder = localUriBuilder.queryParam("includeBuildLogs", includebuildlogs);
        localUriBuilder = localUriBuilder.queryParam("includePersonalChanges", includepersonalchanges);
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("POST", returnType);
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(String param, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(String param, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class Field
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public Field(Client client, String field)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/server");
        _uriBuilder = _uriBuilder.path("/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance
       * 
       */
      public Field(String field)
      {
        this(Client.create(), field);
      }

      /**
       * Get field
       * 
       */
      public String getField()
      {
        return ((String) _templateAndMatrixParameterValues.get("field"));
      }

      /**
       * Set field
       * 
       */
      public TeamCityAndroidWadlServices.AppRestServer.Field setField(String field)
      {
        _templateAndMatrixParameterValues.put("field", field);
        return this;
      }

      public <T> T getAsTextPlain(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsTextPlain(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("text/plain");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class Plugins
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public Plugins(Client client)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/server");
        _uriBuilder = _uriBuilder.path("/plugins");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      /**
       * Create new instance
       * 
       */
      public Plugins()
      {
        this(Client.create());
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

  }

  public static class AppRestUserGroups
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestUserGroups(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/userGroups");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestUserGroups()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRoles groupLocatorRoles(String grouplocator)
    {
      return new TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRoles(_client, grouplocator);
    }

    public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRolesRoleIdScope groupLocatorRolesRoleIdScope(String grouplocator, String roleid,
        String scope)
    {
      return new TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRolesRoleIdScope(_client, grouplocator, roleid, scope);
    }

    public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocator groupLocator(String grouplocator)
    {
      return new TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocator(_client, grouplocator);
    }

    public static class GroupLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public GroupLocator(Client client, String grouplocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/userGroups");
        _uriBuilder = _uriBuilder.path("/{groupLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
      }

      /**
       * Create new instance
       * 
       */
      public GroupLocator(String grouplocator)
      {
        this(Client.create(), grouplocator);
      }

      /**
       * Get groupLocator
       * 
       */
      public String getGrouplocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("groupLocator"));
      }

      /**
       * Set groupLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocator setGrouplocator(String grouplocator)
      {
        _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class GroupLocatorRoles
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public GroupLocatorRoles(Client client, String grouplocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/userGroups");
        _uriBuilder = _uriBuilder.path("/{groupLocator}/roles");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
      }

      /**
       * Create new instance
       * 
       */
      public GroupLocatorRoles(String grouplocator)
      {
        this(Client.create(), grouplocator);
      }

      /**
       * Get groupLocator
       * 
       */
      public String getGrouplocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("groupLocator"));
      }

      /**
       * Set groupLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRoles setGrouplocator(String grouplocator)
      {
        _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
        return this;
      }

      public <T> T putApplicationXml(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationXml(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class GroupLocatorRolesRoleIdScope
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public GroupLocatorRolesRoleIdScope(Client client, String grouplocator, String roleid, String scope)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/userGroups");
        _uriBuilder = _uriBuilder.path("/{groupLocator}/roles/{roleId}/{scope}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
        _templateAndMatrixParameterValues.put("roleId", roleid);
        _templateAndMatrixParameterValues.put("scope", scope);
      }

      /**
       * Create new instance
       * 
       */
      public GroupLocatorRolesRoleIdScope(String grouplocator, String roleid, String scope)
      {
        this(Client.create(), grouplocator, roleid, scope);
      }

      /**
       * Get groupLocator
       * 
       */
      public String getGrouplocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("groupLocator"));
      }

      /**
       * Set groupLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRolesRoleIdScope setGrouplocator(String grouplocator)
      {
        _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
        return this;
      }

      /**
       * Get roleId
       * 
       */
      public String getRoleid()
      {
        return ((String) _templateAndMatrixParameterValues.get("roleId"));
      }

      /**
       * Set roleId
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRolesRoleIdScope setRoleid(String roleid)
      {
        _templateAndMatrixParameterValues.put("roleId", roleid);
        return this;
      }

      /**
       * Get scope
       * 
       */
      public String getScope()
      {
        return ((String) _templateAndMatrixParameterValues.get("scope"));
      }

      /**
       * Set scope
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUserGroups.GroupLocatorRolesRoleIdScope setScope(String scope)
      {
        _templateAndMatrixParameterValues.put("scope", scope);
        return this;
      }

      public void deleteAsvoid()
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder.method("DELETE", Void.class);
      }

      public <T> T delete(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T delete(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T getAs(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("*/*");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAs(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("*/*");
        return resourceBuilder.method("GET", returnType);
      }

      public void postAsvoid()
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder.method("POST", Void.class);
      }

      public <T> T post(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("POST", returnType);
      }

      public <T> T post(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("POST", returnType);
      }

    }

  }

  public static class AppRestUsers
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestUsers(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/users");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestUsers()
    {
      this(Client.create());
    }

    public <T> T postApplicationXmlAs(Object input, GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.type("application/xml");
      resourceBuilder = resourceBuilder.accept("*/*");
      return resourceBuilder.method("POST", returnType, input);
    }

    public <T> T postApplicationXmlAs(Object input, Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.type("application/xml");
      resourceBuilder = resourceBuilder.accept("*/*");
      return resourceBuilder.method("POST", returnType, input);
    }

    public <T> T postApplicationJsonAs(Object input, GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.type("application/json");
      resourceBuilder = resourceBuilder.accept("*/*");
      return resourceBuilder.method("POST", returnType, input);
    }

    public <T> T postApplicationJsonAs(Object input, Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.type("application/json");
      resourceBuilder = resourceBuilder.accept("*/*");
      return resourceBuilder.method("POST", returnType, input);
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRoles userLocatorRoles(String userlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRoles(_client, userlocator);
    }

    public TeamCityAndroidWadlServices.AppRestUsers.UserLocator userLocator(String userlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestUsers.UserLocator(_client, userlocator);
    }

    public TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRolesRoleIdScope userLocatorRolesRoleIdScope(String userlocator, String roleid, String scope)
    {
      return new TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRolesRoleIdScope(_client, userlocator, roleid, scope);
    }

    public static class UserLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public UserLocator(Client client, String userlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/users");
        _uriBuilder = _uriBuilder.path("/{userLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("userLocator", userlocator);
      }

      /**
       * Create new instance
       * 
       */
      public UserLocator(String userlocator)
      {
        this(Client.create(), userlocator);
      }

      /**
       * Get userLocator
       * 
       */
      public String getUserlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("userLocator"));
      }

      /**
       * Set userLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUsers.UserLocator setUserlocator(String userlocator)
      {
        _templateAndMatrixParameterValues.put("userLocator", userlocator);
        return this;
      }

      public <T> T putApplicationXml(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationXml(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class UserLocatorRoles
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public UserLocatorRoles(Client client, String userlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/users");
        _uriBuilder = _uriBuilder.path("/{userLocator}/roles");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("userLocator", userlocator);
      }

      /**
       * Create new instance
       * 
       */
      public UserLocatorRoles(String userlocator)
      {
        this(Client.create(), userlocator);
      }

      /**
       * Get userLocator
       * 
       */
      public String getUserlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("userLocator"));
      }

      /**
       * Set userLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRoles setUserlocator(String userlocator)
      {
        _templateAndMatrixParameterValues.put("userLocator", userlocator);
        return this;
      }

      public <T> T putApplicationXml(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationXml(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/xml");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T putApplicationJson(Object input, Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.type("application/json");
        return resourceBuilder.method("PUT", returnType, input);
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

    public static class UserLocatorRolesRoleIdScope
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public UserLocatorRolesRoleIdScope(Client client, String userlocator, String roleid, String scope)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/users");
        _uriBuilder = _uriBuilder.path("/{userLocator}/roles/{roleId}/{scope}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("userLocator", userlocator);
        _templateAndMatrixParameterValues.put("roleId", roleid);
        _templateAndMatrixParameterValues.put("scope", scope);
      }

      /**
       * Create new instance
       * 
       */
      public UserLocatorRolesRoleIdScope(String userlocator, String roleid, String scope)
      {
        this(Client.create(), userlocator, roleid, scope);
      }

      /**
       * Get userLocator
       * 
       */
      public String getUserlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("userLocator"));
      }

      /**
       * Set userLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRolesRoleIdScope setUserlocator(String userlocator)
      {
        _templateAndMatrixParameterValues.put("userLocator", userlocator);
        return this;
      }

      /**
       * Get roleId
       * 
       */
      public String getRoleid()
      {
        return ((String) _templateAndMatrixParameterValues.get("roleId"));
      }

      /**
       * Set roleId
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRolesRoleIdScope setRoleid(String roleid)
      {
        _templateAndMatrixParameterValues.put("roleId", roleid);
        return this;
      }

      /**
       * Get scope
       * 
       */
      public String getScope()
      {
        return ((String) _templateAndMatrixParameterValues.get("scope"));
      }

      /**
       * Set scope
       * 
       */
      public TeamCityAndroidWadlServices.AppRestUsers.UserLocatorRolesRoleIdScope setScope(String scope)
      {
        _templateAndMatrixParameterValues.put("scope", scope);
        return this;
      }

      public void deleteAsvoid()
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder.method("DELETE", Void.class);
      }

      public <T> T delete(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T delete(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("DELETE", returnType);
      }

      public <T> T getAs(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("*/*");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAs(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("*/*");
        return resourceBuilder.method("GET", returnType);
      }

      public void postAsvoid()
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder.method("POST", Void.class);
      }

      public <T> T post(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("POST", returnType);
      }

      public <T> T post(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        return resourceBuilder.method("POST", returnType);
      }

    }

  }

  public static class AppRestVcsRoots
  {

    private final Client _client;

    private UriBuilder _uriBuilder;

    private final HashMap<String, Object> _templateAndMatrixParameterValues;

    /**
     * Create new instance using existing Client instance
     * 
     */
    public AppRestVcsRoots(Client client)
    {
      _client = client;
      _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
      _uriBuilder = _uriBuilder.path("/app/rest/vcs-roots");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Create new instance
     * 
     */
    public AppRestVcsRoots()
    {
      this(Client.create());
    }

    public <T> T getAsApplicationXml(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationXml(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/xml");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(GenericType<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public <T> T getAsApplicationJson(Class<T> returnType)
    {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      WebResource.Builder resourceBuilder = resource.getRequestBuilder();
      resourceBuilder = resourceBuilder.accept("application/json");
      return resourceBuilder.method("GET", returnType);
    }

    public TeamCityAndroidWadlServices.AppRestVcsRoots.VcsRootLocator vcsRootLocator(String vcsrootlocator)
    {
      return new TeamCityAndroidWadlServices.AppRestVcsRoots.VcsRootLocator(_client, vcsrootlocator);
    }

    public static class VcsRootLocator
    {

      private final Client _client;

      private UriBuilder _uriBuilder;

      private final HashMap<String, Object> _templateAndMatrixParameterValues;

      /**
       * Create new instance using existing Client instance
       * 
       */
      public VcsRootLocator(Client client, String vcsrootlocator)
      {
        _client = client;
        _uriBuilder = UriBuilder.fromPath("http://developer.smartnsoft.com:8111/");
        _uriBuilder = _uriBuilder.path("/app/rest/vcs-roots");
        _uriBuilder = _uriBuilder.path("/{vcsRootLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
      }

      /**
       * Create new instance
       * 
       */
      public VcsRootLocator(String vcsrootlocator)
      {
        this(Client.create(), vcsrootlocator);
      }

      /**
       * Get vcsRootLocator
       * 
       */
      public String getVcsrootlocator()
      {
        return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
      }

      /**
       * Set vcsRootLocator
       * 
       */
      public TeamCityAndroidWadlServices.AppRestVcsRoots.VcsRootLocator setVcsrootlocator(String vcsrootlocator)
      {
        _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
        return this;
      }

      public <T> T getAsApplicationXml(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationXml(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/xml");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(GenericType<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

      public <T> T getAsApplicationJson(Class<T> returnType)
      {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        WebResource.Builder resourceBuilder = resource.getRequestBuilder();
        resourceBuilder = resourceBuilder.accept("application/json");
        return resourceBuilder.method("GET", returnType);
      }

    }

  }

}
