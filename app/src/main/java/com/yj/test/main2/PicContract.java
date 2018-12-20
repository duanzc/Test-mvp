package com.yj.test.main2;


import com.yj.mvp_lib.Imvp.IBaseModel;
import com.yj.mvp_lib.Imvp.IBasePresenter;
import com.yj.mvp_lib.Imvp.IBaseView;

import io.reactivex.Observable;

public interface PicContract {

    interface PicView extends IBaseView {

        void onSuccess(PicBean msg);

        void onError(String msg);
    }

    interface PicModel extends IBaseModel {
        Observable<PicBean> getLogin(String name, String pwd);
    }

    abstract class PicPresenter extends IBasePresenter<PicModel, PicView> {
        abstract void Onclicklogin(String name, String pwd);
    }
}
