package com.yj.test.main2;

import io.reactivex.functions.Consumer;

public class PicPresenter extends PicContract.PicPresenter {

    public static PicPresenter newInstance() {

        return PicPresenHolder.sInstance;
    }

    public static class PicPresenHolder {
        public static final PicPresenter sInstance = new PicPresenter();
    }

    @Override
    public void Onclicklogin(String name, String pwd) {

        if (model != null | view != null) {
            assert model != null;
            rxManager.register(model.getLogin(name, pwd).subscribe(new Consumer<PicBean>() {
                @Override
                public void accept(PicBean picBean) throws Exception {
                    if (view == null) {
                        return;
                    }
                    view.onSuccess(picBean);
                }
            }, new Consumer<Throwable>() {
                @Override
                public void accept(Throwable throwable) throws Exception {
                    if (view == null)
                        return;

                    view.onError(throwable.toString());
                }
            }));

        }
    }

    @Override
    public PicContract.PicModel getModel() {
        return PicModel.newInstance();
    }
}
