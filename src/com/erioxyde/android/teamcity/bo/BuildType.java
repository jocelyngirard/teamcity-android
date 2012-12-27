package com.erioxyde.android.teamcity.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildType implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final class BuildTypeList implements Serializable {
        private static final long serialVersionUID = 1L;
        public List<BuildType> buildType;

        public CharSequence[] getBuildTypeNames() {
            if (buildType != null) {
                List<String> names = new ArrayList<String>();
                for (BuildType build : buildType) {
                    names.add(build.name);
                }
                return names.toArray(new String[names.size()]);
            }
            return new String[] { "" };
        }
    }

    public String id;

    public String name;

    public String projectName;

    public String projectId;

    public String href;

    public String webUrl;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (href == null ? 0 : href.hashCode());
        result = prime * result + (id == null ? 0 : id.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (projectId == null ? 0 : projectId.hashCode());
        result = prime * result + (projectName == null ? 0 : projectName.hashCode());
        result = prime * result + (webUrl == null ? 0 : webUrl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BuildType other = (BuildType) obj;
        if (href == null) {
            if (other.href != null) {
                return false;
            }
        } else if (!href.equals(other.href)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (projectId == null) {
            if (other.projectId != null) {
                return false;
            }
        } else if (!projectId.equals(other.projectId)) {
            return false;
        }
        if (projectName == null) {
            if (other.projectName != null) {
                return false;
            }
        } else if (!projectName.equals(other.projectName)) {
            return false;
        }
        if (webUrl == null) {
            if (other.webUrl != null) {
                return false;
            }
        } else if (!webUrl.equals(other.webUrl)) {
            return false;
        }
        return true;
    }

}
