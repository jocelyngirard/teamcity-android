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
import com.erioxyde.android.teamcity.bo.Build;
import com.erioxyde.android.teamcity.bo.Build.BuildList;
import com.erioxyde.android.teamcity.bo.BuildType;
import com.erioxyde.android.teamcity.bo.BuildType.BuildTypeList;
import com.erioxyde.android.teamcity.bo.Project.Projects;
import com.erioxyde.android.teamcity.bo.ProjectInfos;
import com.smartnsoft.droid4me.cache.Persistence;
import com.smartnsoft.droid4me.cache.Persistence.PersistenceException;
import com.smartnsoft.droid4me.cache.Values.CacheException;
import com.smartnsoft.droid4me.ws.WSUriStreamParser.KeysAggregator;
import com.smartnsoft.droid4me.ws.WebServiceCaller;
import com.smartnsoft.droid4me.ws.WithCacheWSUriStreamParser.SimpleIOStreamerSourceKey;
import com.smartnsoft.droid4me.wscache.BackedWSUriStreamParser;

/**
 * A single point of access to the web services.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class TeamCityAndroidServices extends WebServiceCaller {

    public final static class TeamCityCredentials {
        public String login;

        public String password;

        public TeamCityCredentials(String login, String password) {
            this.login = login;
            this.password = password;
        }

    }

    public interface TeamCityInformations {
        public TeamCityCredentials getCredentials();

        public String getServerURL();
    }

    private static volatile TeamCityAndroidServices instance;

    // We accept the "out-of-order writes" case
    public static TeamCityAndroidServices getInstance() {
        if (instance == null) {
            synchronized (TeamCityAndroidServices.class) {
                if (instance == null) {
                    instance = new TeamCityAndroidServices();
                }
            }
        }
        return instance;
    }

    private TeamCityInformations teamCityInformations;

    private TeamCityAndroidServices() {
    }

    public void setTeamCityInformations(TeamCityInformations teamCityInformations) {
        this.teamCityInformations = teamCityInformations;
    }

    @Override
    protected HttpClient computeHttpClient() {
        return super.computeHttpClient();
    }

    @Override
    protected void onBeforeHttpRequestExecution(HttpClient httpClient, HttpRequestBase request) throws CallException {
        if (httpClient instanceof DefaultHttpClient) {
            final DefaultHttpClient defaultHttpClient = (DefaultHttpClient) httpClient;
            final TeamCityCredentials credentials = teamCityInformations.getCredentials();
            defaultHttpClient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), new UsernamePasswordCredentials(credentials.login, credentials.password));
            request.addHeader(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
            request.addHeader(new BasicHeader("Accept", "application/json"));
        } else {
            super.onBeforeHttpRequestExecution(httpClient, request);
        }
    }

    @Override
    protected String getUrlEncoding() {
        return Constants.WEBSERVICES_HTML_ENCODING;
    }

    private <T> T deserializeJson(InputStream inputStream, Class<T> valueType) {
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            final String json = WebServiceCaller.getString(inputStream);
            return objectMapper.readValue(json, valueType);
        } catch (JsonParseException jsonParseException) {
            if (log.isErrorEnabled()) {
                log.error("Error while parsing a JSON object via Jackson !", jsonParseException);
            }
        } catch (JsonMappingException jsonMappingException) {
            if (log.isErrorEnabled()) {
                log.error("Error while mapping a JSON object via Jackson !", jsonMappingException);
            }
        } catch (IOException ioException) {
            if (log.isErrorEnabled()) {
                log.error("I/O error while reading the JSON object via Jackson !", ioException);
            }
        }
        return null;
    }

    private String serializeObject(Object object) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        final JsonFactory jacksonFactory = new JsonFactory();
        final StringWriter writer = new StringWriter();
        final JsonGenerator jsonGenerator = jacksonFactory.createJsonGenerator(writer);
        objectMapper.writeValue(jsonGenerator, object);
        return writer.toString();
    }

    private final BackedWSUriStreamParser.BackedUriStreamedValue<Projects, Void, JSONException, PersistenceException> projectsStreamParser = new BackedWSUriStreamParser.BackedUriStreamedValue<Projects, Void, JSONException, PersistenceException>(Persistence.getInstance(0), this) {

        public KeysAggregator<Void> computeUri(Void parameter) {
            return SimpleIOStreamerSourceKey.fromUriStreamerSourceKey(new HttpCallTypeAndBody(computeUri(teamCityInformations.getServerURL(), "httpAuth/app/rest/projects/", null)), null);
        }

        public Projects parse(Void parameter, InputStream inputStream) throws JSONException {
            return deserializeJson(inputStream, Projects.class);
        }

    };

    public final Projects getProjects(boolean fromCache) throws CacheException {
        if (log.isInfoEnabled()) {
            log.info("Retrieve the list of projects");
        }
        return projectsStreamParser.backed.getRetentionValue(fromCache, Constants.CACHING_PERIOD_IN_MILLESCONDS, null, null);
    }

    private final BackedWSUriStreamParser.BackedUriStreamedMap<ProjectInfos, String, JSONException, PersistenceException> projectStreamParser = new BackedWSUriStreamParser.BackedUriStreamedMap<ProjectInfos, String, JSONException, PersistenceException>(Persistence.getInstance(0), this) {

        public KeysAggregator<String> computeUri(String parameter) {
            return SimpleIOStreamerSourceKey.fromUriStreamerSourceKey(new HttpCallTypeAndBody(computeUri(teamCityInformations.getServerURL(), "httpAuth/app/rest/projects/id:" + parameter, null)), null);
        }

        public ProjectInfos parse(String parameter, InputStream inputStream) throws JSONException {
            return deserializeJson(inputStream, ProjectInfos.class);
        }

    };

    public final ProjectInfos getProject(boolean fromCache, String projectId) throws CacheException {
        if (log.isInfoEnabled()) {
            log.info("Retrieve the projects with id:" + projectId);
        }
        return projectStreamParser.backed.getRetentionValue(fromCache, Constants.CACHING_PERIOD_IN_MILLESCONDS, null, projectId);
    }

    private final BackedWSUriStreamParser.BackedUriStreamedValue<List<BuildType>, Void, JSONException, PersistenceException> buildTypesStreamParser = new BackedWSUriStreamParser.BackedUriStreamedValue<List<BuildType>, Void, JSONException, PersistenceException>(Persistence.getInstance(0), this) {

        public KeysAggregator<Void> computeUri(Void parameter) {
            return SimpleIOStreamerSourceKey.fromUriStreamerSourceKey(new HttpCallTypeAndBody(computeUri(teamCityInformations.getServerURL(), "httpAuth/app/rest/buildTypes/", null)), null);
        }

        public List<BuildType> parse(Void parameter, InputStream inputStream) throws JSONException {
            return deserializeJson(inputStream, BuildTypeList.class).buildType;
        }

    };

    public final List<BuildType> getBuildTypes(boolean fromCache) throws CacheException {
        if (log.isInfoEnabled()) {
            log.info("Retrieve the list of projects");
        }
        return buildTypesStreamParser.backed.getRetentionValue(fromCache, Constants.CACHING_PERIOD_IN_MILLESCONDS, null, null);
    }

    private final BackedWSUriStreamParser.BackedUriStreamedMap<List<Build>, BuildType, JSONException, PersistenceException> buildsStreamParser = new BackedWSUriStreamParser.BackedUriStreamedMap<List<Build>, BuildType, JSONException, PersistenceException>(Persistence.getInstance(0), this) {

        public KeysAggregator<BuildType> computeUri(BuildType parameter) {
            return SimpleIOStreamerSourceKey.fromUriStreamerSourceKey(new HttpCallTypeAndBody(computeUri(teamCityInformations.getServerURL(), "httpAuth/app/rest/buildTypes/id:" + parameter.id + "/builds/", null)), parameter);
        }

        public List<Build> parse(BuildType parameter, InputStream inputStream) throws JSONException {
            return deserializeJson(inputStream, BuildList.class).build;
        }

    };

    public final List<Build> getBuilds(boolean fromCache, BuildType buildType) throws CacheException {
        if (log.isInfoEnabled()) {
            log.info("Retrieve the list of projects");
        }
        return buildsStreamParser.backed.getRetentionValue(fromCache, Constants.CACHING_PERIOD_IN_MILLESCONDS, null, buildType);
    }

}
