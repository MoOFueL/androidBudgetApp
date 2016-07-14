package com.moofuel.budget.services;

import com.moofuel.budget.misc.AuthObject;
import com.moofuel.budget.misc.GeneralResponse;

/**
 * Created by Дмитрий on 10.07.2016.
 */
public interface LoginService {

    GeneralResponse doAuth(AuthObject authObject);
}
