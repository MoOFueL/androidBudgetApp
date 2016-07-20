package com.moofuel.budget.domain;

/**
 * @author MoOFueL
 */
public class AuthObject {

    private String fio;
    private String password;

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
