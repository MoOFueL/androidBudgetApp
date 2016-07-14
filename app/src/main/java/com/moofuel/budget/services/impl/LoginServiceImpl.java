package com.moofuel.budget.services.impl;

import android.os.AsyncTask;

import com.moofuel.budget.misc.AuthObject;
import com.moofuel.budget.services.LoginService;

/**
 * @author MoOFueL
 */
public class LoginServiceImpl extends AsyncTask<Void, Void, Boolean> implements LoginService {

    private String fio;
    private String password;
    private AuthObject authObject;
    private Boolean isAuthorized;


    @Override
    public Boolean doAuth(AuthObject authObject) {
        this.execute((Void) null);
        return false;
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        // TODO: 14.07.2016  
        return null;
    }

    @Override
    protected void onPostExecute(final Boolean success) {
        // TODO: 14.07.2016  
    }

    @Override
    protected void onCancelled() {
        // TODO: 14.07.2016  
    }
}
