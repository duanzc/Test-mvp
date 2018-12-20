package com.yj.mvp_lib.Imvp;

import android.support.annotation.NonNull;

import com.yj.mvp_lib.http.RxjavaManage;

public abstract class IBasePresenter<M, V> {

    protected M model;
    protected V view;

    protected RxjavaManage rxManager = new RxjavaManage();

    /**
     * 获取model
     * @return
     */
    public abstract M getModel();

    /**
     * 绑定v 、m
     * @param v
     */
    public void attchMView(@NonNull V v) {
        this.view = v;
        this.model = getModel();
    }

    /**
     * 解绑
     */
    public void detachMView() {
        model = null;
        view = null;
        rxManager.unSubscribe();
    }

}
