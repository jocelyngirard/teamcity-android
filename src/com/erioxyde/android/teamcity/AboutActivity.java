package com.erioxyde.android.teamcity;

/**
 * The "about" screen.
 * 
 * @author Jocelyn Girard
 * @since 2012.02.23
 */
public final class AboutActivity extends TeamCityFragmentActivity {

    public void onRetrieveDisplayObjects() {
        setContentView(R.layout.about);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onRetrieveBusinessObjects() throws BusinessObjectUnavailableException {
    }

    public void onFulfillDisplayObjects() {
    }

    public void onSynchronizeDisplayObjects() {
    }

}
