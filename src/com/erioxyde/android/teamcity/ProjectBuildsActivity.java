package com.erioxyde.android.teamcity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.erioxyde.android.teamcity.bo.Build;
import com.erioxyde.android.teamcity.bo.BuildType;
import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.smartnsoft.droid4me.cache.Values.CacheException;
import com.smartnsoft.droid4me.framework.SmartAdapters;
import com.smartnsoft.droid4me.framework.SmartAdapters.BusinessViewWrapper;
import com.smartnsoft.droid4me.framework.SmartAdapters.SimpleBusinessViewWrapper;

public class ProjectBuildsActivity extends TeamCityListActivity {

    public static final String BUILD_TYPE = "buildTypeId";

    public static final class BuildAttributes {

        private final TextView text1;

        private final TextView text2;

        public BuildAttributes(View view) {
            text1 = (TextView) view.findViewById(android.R.id.text1);
            text2 = (TextView) view.findViewById(android.R.id.text2);
        }

        public void update(Build businessObject) {
            text1.setText(businessObject.number);
            text2.setText(businessObject.status.toString());
        }

    }

    private final static class BuildWrapper extends SimpleBusinessViewWrapper<Build> {

        public BuildWrapper(Build businessObject) {
            super(businessObject, 0, android.R.layout.simple_list_item_2);
        }

        @Override
        protected Object extractNewViewAttributes(Activity activity, View view, Build businessObject) {
            return new BuildAttributes(view);
        }

        @Override
        protected void updateView(Activity activity, Object viewAttributes, View view, Build businessObject, int position) {
            ((BuildAttributes) viewAttributes).update(businessObject);
        }

    }

    private BuildType buildType;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        buildType = (BuildType) getIntent().getSerializableExtra(ProjectBuildsActivity.BUILD_TYPE);
        getActionBar().setTitle(buildType.projectName);
        getActionBar().setSubtitle(buildType.name);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public List<? extends BusinessViewWrapper<?>> retrieveBusinessObjectsList() throws BusinessObjectUnavailableException {
        final List<Build> builds;
        try {
            builds = TeamCityAndroidServices.getInstance().getBuilds(fromCache, buildType);
        } catch (CacheException exception) {
            throw new BusinessObjectUnavailableException(exception);
        }
        final List<BusinessViewWrapper<?>> wrappers = new ArrayList<SmartAdapters.BusinessViewWrapper<?>>();
        for (Build build : builds) {
            wrappers.add(new BuildWrapper(build));
        }
        return wrappers;
    }

}
