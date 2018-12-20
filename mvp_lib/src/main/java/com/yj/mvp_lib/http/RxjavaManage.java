package com.yj.mvp_lib.http;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * 管理事件
 */
public class RxjavaManage {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();


    public void register(Disposable disposable) {
        compositeDisposable.add(disposable);

    }

    /**
     * 取消订阅
     */
    public void unSubscribe() {
        compositeDisposable.dispose();
    }

}

