package com.moofuel.budget.services.impl;

import android.os.AsyncTask;

import com.moofuel.budget.misc.AuthObject;
import com.moofuel.budget.misc.GeneralResponse;
import com.moofuel.budget.services.LoginService;

/**
 * Created by Дмитрий on 14.07.2016.
 */
public class LoginServiceImpl extends AsyncTask<Void, Void, Boolean> implements LoginService {
    @Override
    public GeneralResponse doAuth(AuthObject authObject) {
        return null;
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        return null;
    }
}
