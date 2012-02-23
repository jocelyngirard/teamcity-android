package com.erioxyde.android.teamcity.bo;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project
    implements Serializable
{

  private static final long serialVersionUID = -3826296959945801197L;

  public static final class ProjectList
      implements Serializable
  {
    private static final long serialVersionUID = -375344264382194260L;

    public List<Project> project;
  }

  public String id;

  public String name;

  public String href;
}
