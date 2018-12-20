package com.yj.mvp_lib.Imvp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * base 类 、继承
 * @param <P>
 */
public abstract class IBaseMvpActivity<P extends IBasePresenter> extends AppCompatActivity implements IBaseView {

    protected P mpresenter;
    protected ProgressDialog progressDialog;

    public static final String TAG="duanc";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mpresenter = (P) initPresenter();
        if (mpresenter != null) {
            mpresenter.attchMView(this);
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mpresenter.detachMView();
    }


    @Override
    public void showDialog(String msg) {
        startLoading(msg);
        Log.i(TAG, "showDialog: "+msg);
    }

    public void startLoading(String msg){
        progressDialog = ProgressDialog.show(this, null, msg);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(true);
    }

    @Override
    public void hideDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, "2.0--->"+msg, Toast.LENGTH_SHORT).show();
    }
}
