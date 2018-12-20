package com.yj.test.mvp;

public class LoginModel {

    public boolean onLogin(String name, String pwd) {
        boolean su = false;
        if (name.equals("123456")) {
            su = true;
        } else {
            su = false;
        }

        return su;
    }
}
