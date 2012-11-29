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

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((buildTypeId == null) ? 0 : buildTypeId.hashCode());
    result = prime * result + ((href == null) ? 0 : href.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((number == null) ? 0 : number.hashCode());
    result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + ((webUrl == null) ? 0 : webUrl.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Build other = (Build) obj;
    if (buildTypeId == null)
    {
      if (other.buildTypeId != null)
        return false;
    }
    else if (!buildTypeId.equals(other.buildTypeId))
      return false;
    if (href == null)
    {
      if (other.href != null)
        return false;
    }
    else if (!href.equals(other.href))
      return false;
    if (id == null)
    {
      if (other.id != null)
        return false;
    }
    else if (!id.equals(other.id))
      return false;
    if (number == null)
    {
      if (other.number != null)
        return false;
    }
    else if (!number.equals(other.number))
      return false;
    if (startDate == null)
    {
      if (other.startDate != null)
        return false;
    }
    else if (!startDate.equals(other.startDate))
      return false;
    if (status != other.status)
      return false;
    if (webUrl == null)
    {
      if (other.webUrl != null)
        return false;
    }
    else if (!webUrl.equals(other.webUrl))
      return false;
    return true;
  }

}
