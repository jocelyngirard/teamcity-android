package com.erioxyde.android.teamcity;

import android.view.MenuItem;
import com.erioxyde.android.teamcity.fragments.ProjectBuildsFragment;
import com.smartnsoft.droid4me.framework.Commands;
import com.smartnsoft.droid4me.menu.StaticMenuCommand;
import com.smartnsoft.droid4me.support.v4.menu.ActionMenuCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * The starting screen of the application.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class ProjectBuildsActivity extends TeamCityFragmentActivity
{
	public void onRetrieveBusinessObjects()
			throws BusinessObjectUnavailableException {
		getSupportFragmentManager().beginTransaction().add(android.R.id.content, new ProjectBuildsFragment()).commit();
	}
	public void onFulfillDisplayObjects() {

	}

	public void onRetrieveDisplayObjects() {

	}

	public void onSynchronizeDisplayObjects() {

	}

}
