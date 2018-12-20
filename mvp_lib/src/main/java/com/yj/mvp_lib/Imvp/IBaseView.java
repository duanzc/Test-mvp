package com.yj.mvp_lib.Imvp;

import android.support.annotation.NonNull;

public interface IBaseView {

    /**
     * 绑定 p和 v 之间的关系。
     *
     * @return
     */
    @NonNull
    IBasePresenter initPresenter();


    /**
     * 显示弹窗
     * @param msg
     */
    void showDialog(String msg);

    /**
     * 取消弹窗
     */
    void hideDialog();

    /**
     * 显示吐司
     * @param msg
     */
    void showToast(String msg);


}
