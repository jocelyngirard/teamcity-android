package com.erioxyde.android.teamcity.ws;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;

import com.erioxyde.android.teamcity.Constants;
import com.erioxyde.android.teamcity.bo.Project;
import com.erioxyde.android.teamcity.bo.Project.ProjectList;
import com.smartnsoft.droid4me.cache.Persistence;
import com.smartnsoft.droid4me.cache.Persistence.PersistenceException;
import com.smartnsoft.droid4me.cache.Values.CacheException;
import com.smartnsoft.droid4me.ws.WebServiceCaller;
import com.smartnsoft.droid4me.ws.WithCacheWSUriStreamParser.SimpleIOStreamerSourceKey;
import com.smartnsoft.droid4me.wscache.BackedWSUriStreamParser;

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
  protected HttpClient computeHttpClient()
  {
    return super.computeHttpClient();
  }

  @Override
  protected void onBeforeHttpRequestExecution(HttpClient httpClient, HttpRequestBase request)
      throws CallException
  {
    if (httpClient instanceof DefaultHttpClient)
    {
      final DefaultHttpClient defaultHttpClient = ((DefaultHttpClient) httpClient);
      defaultHttpClient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), new UsernamePasswordCredentials("", ""));
      request.addHeader(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
      request.addHeader(new BasicHeader("Accept", "application/json"));
    }
    else
    {
      super.onBeforeHttpRequestExecution(httpClient, request);
    }
  }

  @Override
  protected String getUrlEncoding()
  {
    return Constants.WEBSERVICES_HTML_ENCODING;
  }

  private <T> T deserializeJson(InputStream inputStream, Class<T> valueType)
  {
    final ObjectMapper objectMapper = new ObjectMapper();
    try
    {
      final String json = WebServiceCaller.getString(inputStream);
      return objectMapper.readValue(json, valueType);
    }
    catch (JsonParseException jsonParseException)
    {
      if (log.isErrorEnabled())
      {
        log.error("Error while parsing a JSON object via Jackson !", jsonParseException);
      }
    }
    catch (JsonMappingException jsonMappingException)
    {
      if (log.isErrorEnabled())
      {
        log.error("Error while mapping a JSON object via Jackson !", jsonMappingException);
      }
    }
    catch (IOException ioException)
    {
      if (log.isErrorEnabled())
      {
        log.error("I/O error while reading the JSON object via Jackson !", ioException);
      }
    }
    return null;
  }

  private String serializeObject(Object object)
      throws IOException
  {
    final ObjectMapper objectMapper = new ObjectMapper();
    final JsonFactory jacksonFactory = new JsonFactory();
    final StringWriter writer = new StringWriter();
    final JsonGenerator jsonGenerator = jacksonFactory.createJsonGenerator(writer);
    objectMapper.writeValue(jsonGenerator, object);
    return writer.toString();
  }

  private final BackedWSUriStreamParser.BackedUriStreamedValue<List<Project>, Void, JSONException, PersistenceException> projectsStreamParser = new BackedWSUriStreamParser.BackedUriStreamedValue<List<Project>, Void, JSONException, PersistenceException>(Persistence.getInstance(0), this)
  {

    public KeysAggregator<Void> computeUri(Void parameter)
    {
      return SimpleIOStreamerSourceKey.fromUriStreamerSourceKey(new HttpCallTypeAndBody(computeUri("", "httpAuth/app/rest/projects/", null)), null);
    }

    public List<Project> parse(Void parameter, InputStream inputStream)
        throws JSONException
    {
      return deserializeJson(inputStream, ProjectList.class).project;
    }

  };

  public final List<Project> getProjects(boolean fromCache)
      throws CacheException
  {
    if (log.isInfoEnabled())
    {
      log.info("Retrieve the list of projects");
    }
    return projectsStreamParser.backed.getMemoryValue(fromCache, null, null);
  }

}
