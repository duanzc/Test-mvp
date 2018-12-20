package com.yj.test.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.yj.test.R;
import com.yj.test.mvp.LoginModel;
import com.yj.test.mvp.LoginPresenter;
import com.yj.test.mvp.LoginView;

/**
 * 1.0版本
 */
public class MainActivity extends AppCompatActivity implements LoginView {

    private EditText tvname, tvpwd;
    private Button btn;

    private LoginPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvname = findViewById(R.id.edit_name);
        tvpwd = findViewById(R.id.edit_pwd);
        btn = findViewById(R.id.btn);

        presenter = new LoginPresenter(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onClicked(tvname.getText().toString(), tvpwd.getText().toString());
            }
        });
    }

    @Override
    public void onSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
