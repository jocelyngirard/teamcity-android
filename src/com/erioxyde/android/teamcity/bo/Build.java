package com.erioxyde.android.teamcity.bo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import android.text.format.Time;

enum Status
{
  SUCCESS, FAILURE, ERROR
}

@JsonIgnoreProperties(ignoreUnknown = true)
public class Build
{

  public static final class BuildList
  {
    public String nextHref;

    public int count;

    public List<Build> build;
  }

  public String id;

  public String number;

  public Status status;

  public String buildTypeId;

  public Time startDate;

  public String href;

  public String webUrl;
}
