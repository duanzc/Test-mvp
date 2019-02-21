package com.yj.test.main2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.yj.mvp_lib.Imvp.IBaseMvpActivity;
import com.yj.mvp_lib.Imvp.IBasePresenter;
import com.yj.mvp_lib.utils.StatusTopUtils;
import com.yj.test.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 2.0版本
 */
public class Main2Activity extends IBaseMvpActivity<PicContract.PicPresenter> implements PicContract.PicView {

    @BindView(R.id.et_name)
    EditText etName;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    @BindView(R.id.view)
    LinearLayout view;

    private ArrayList<PicBean.DataBean> mlist = new ArrayList<>();
    RecyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        int top = StatusTopUtils.getStatusTopSize(this);
        view.setPadding(0, top, 0, 0);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog("login...");
                mpresenter.Onclicklogin(etName.getText().toString(), etPwd.getText().toString());
            }
        });
        recyclerview.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(manager);
        adapter = new RecyAdapter(this, mlist);
        recyclerview.setAdapter(adapter);

    }

    @NonNull
    @Override
    public IBasePresenter initPresenter() {
        return PicPresenter.newInstance();
    }


    @Override
    public void onSuccess(PicBean msg) {
        hideDialog();
        mlist.addAll(msg.getData());
        adapter.notifyDataSetChanged();
        showToast("success");
    }

    @Override
    public void onError(String msg) {
        hideDialog();
        showToast("error");
    }

    @Override
    public void showDialog(String msg) {
        super.showDialog(msg);

    }
}
