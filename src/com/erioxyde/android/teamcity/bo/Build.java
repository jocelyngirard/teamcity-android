package com.erioxyde.android.teamcity.bo;

import java.util.Date;

enum Status
{
  SUCCESS, FAILURE, ERROR
}

public class Build
{

  public String id;

  public String number;

  public Status status;

  public String buildTypeId;

  public Date startDate;

  public String href;

  public String webUrl;
}
