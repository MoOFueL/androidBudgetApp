package com.moofuel.budget.services;

import com.moofuel.budget.misc.AuthObject;

/**
 * @author MoOFueL
 */
public interface LoginService {

    Boolean doAuth(AuthObject authObject);
}
