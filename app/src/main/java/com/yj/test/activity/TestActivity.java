package com.yj.test.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yj.test.R;
import com.yj.test.main2.Main2Activity;
import com.yj.test.utils.CdTimeTV;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.btn_1, R.id.btn_2})
    public void onClicked(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.btn_2:
                startActivity(new Intent(this, Main2Activity.class));
                break;
        }
    }
}
