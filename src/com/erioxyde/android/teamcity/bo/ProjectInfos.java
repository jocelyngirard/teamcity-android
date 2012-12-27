package com.erioxyde.android.teamcity.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.erioxyde.android.teamcity.bo.BuildType.BuildTypeList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectInfos implements Serializable {

    private static final long serialVersionUID = 1L;

    public boolean archived;

    public String webUrl;

    public String id;

    public String name;

    public String description;

    public String href;

    public BuildTypeList buildTypes;
}
