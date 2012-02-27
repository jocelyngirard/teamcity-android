package com.erioxyde.android.teamcity.bo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildType
{
  public static final class BuildTypeList
  {
    public List<BuildType> buildType;
  }

  public String id;

  public String name;

  public String projectName;

  public String projectId;

  public String href;

  public String webUrl;
}
