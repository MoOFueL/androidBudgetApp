package com.moofuel.budget.misc;

/**
 * Created by Дмитрий on 14.07.2016.
 */
public class AuthObject {

    private String fio;

    private String password;

    public AuthObject() {
    }

    public AuthObject(String fio, String password) {
        this.fio = fio;
        this.password = password;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthObject{" +
                "fio='" + fio + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
