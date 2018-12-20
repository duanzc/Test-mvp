package com.yj.test.mvp;

/**
 * MVP 1.0版
 */
public class LoginPresenter {

    private LoginModel model;
    private LoginView view;


    public LoginPresenter(LoginView view) {
        this.view = view;
        model = new LoginModel();
    }

    public void onClicked(String name, String pwd) {
        if (model.onLogin(name, pwd)) {
            view.onSuccess("success");
        } else {
            view.onSuccess("error");
        }
    }


}
