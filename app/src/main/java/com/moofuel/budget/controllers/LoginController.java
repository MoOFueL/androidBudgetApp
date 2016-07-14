package com.moofuel.budget.controllers;

import com.moofuel.budget.misc.AuthObject;
import com.moofuel.budget.services.impl.LoginServiceImpl;

/**
 * Created by Дмитрий on 10.07.2016.
 */
public class LoginController {

    private final LoginServiceImpl loginService = new LoginServiceImpl();

    public Boolean doAuth(String fio, String password) {

        AuthObject authObject = new AuthObject(fio, password);
        return loginService.doAuth(authObject);
    }


}
