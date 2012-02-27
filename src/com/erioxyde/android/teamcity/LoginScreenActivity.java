package com.erioxyde.android.teamcity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.erioxyde.android.teamcity.ws.TeamCityAndroidServices;
import com.smartnsoft.droid4me.app.SmartActivity;
import com.smartnsoft.droid4me.app.SmartCommands;

public class LoginScreenActivity
    extends SmartActivity<TitleBar.TitleBarAggregate>
    implements OnClickListener
{

  public static final String SERVER_URL = "serverUrl";

  public static final String USER_LOGIN = "userLogin";

  public static final String USER_PASSWORD = "userPassword";

  private EditText uriAcces;

  private EditText userLogin;

  private EditText userPassword;

  private Button connectButton;

  private ProgressDialog progressDialog;

  public void onRetrieveDisplayObjects()
  {
    setContentView(R.layout.login);

    uriAcces = (EditText) findViewById(R.id.uriAcces);
    userLogin = (EditText) findViewById(R.id.userLogin);
    userPassword = (EditText) findViewById(R.id.userPassword);
    connectButton = (Button) findViewById(R.id.connectButton);
  }

  public void onRetrieveBusinessObjects()
      throws BusinessObjectUnavailableException
  {

  }

  public void onFulfillDisplayObjects()
  {
    connectButton.setOnClickListener(this);
  }

  public void onSynchronizeDisplayObjects()
  {

  }

  public void onClick(View view)
  {
    if (view == connectButton)
    {
      final String serverUrl = uriAcces.getEditableText().toString();
      final String login = userLogin.getEditableText().toString();
      final String password = userPassword.getEditableText().toString();

      getPreferences().edit().putString(LoginScreenActivity.SERVER_URL, serverUrl).putString(LoginScreenActivity.USER_LOGIN, login).putString(
          LoginScreenActivity.USER_PASSWORD, password).commit();

      progressDialog = new ProgressDialog(this);
      progressDialog.setMessage(getString(R.string.loading));
      progressDialog.setIndeterminate(true);
      progressDialog.setCancelable(false);
      progressDialog.show();

      SmartCommands.execute(new SmartCommands.DialogGuardedCommand(this, "Connectivity problem on login from LoginScreen !", R.string.connectivityProblem, progressDialog)
      {
        @Override
        protected void runGuardedDialog()
            throws Exception
        {
          TeamCityAndroidServices.getInstance().getProjects(false);
          startActivity(new Intent(getContext(), ProjectsActivity.class));
        }

        @Override
        public Throwable onThrowable(Throwable throwable)
        {
          getPreferences().edit().clear().commit();
          return super.onThrowable(throwable);
        }
      });

    }
  }
}
