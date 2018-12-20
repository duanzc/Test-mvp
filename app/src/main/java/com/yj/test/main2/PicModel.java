package com.yj.test.main2;


import com.yj.mvp_lib.http.RetrofitHelper;
import com.yj.mvp_lib.http.RxHelper;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class PicModel implements PicContract.PicModel {

    public static PicModel newInstance() {
        return PicHodler.sInstance;
    }

    public static class PicHodler{
        private static final PicModel sInstance = new PicModel();
    }


    @Override
    public Observable<PicBean> getLogin(String name, String pwd) {


        return RetrofitHelper.createApi(PicApi.class).getPicType()
                .compose(RxHelper.<PicBean>rxSchedulerHelper())
                .map(new Function<PicBean, PicBean>() {
                    @Override
                    public PicBean apply(PicBean picBean) throws Exception {
                        return picBean;
                    }
                });
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//        return null;
    }
}
