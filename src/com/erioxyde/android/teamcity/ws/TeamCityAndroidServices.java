package com.erioxyde.android.teamcity.ws;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

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
  protected void onBeforeHttpRequestExecution(HttpClient httpClient, HttpRequestBase request)
      throws CallException
  {
    ((DefaultHttpClient) httpClient).getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
        new UsernamePasswordCredentials("looknbe", "valid"));
    super.onBeforeHttpRequestExecution(httpClient, request);
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

}
