package com.yj.test.utils;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;


import java.util.concurrent.TimeUnit;

import static com.yj.mvp_lib.Imvp.IBaseMvpActivity.TAG;

/**
 * 倒计时
 */
public class CdTimeTV extends android.support.v7.widget.AppCompatTextView {

    private long mAlltime;
    private CountDownTimer timer;

    public CdTimeTV(Context context, long mAlltime) {
        super(context);
        this.mAlltime = mAlltime;
    }

    public CdTimeTV(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CdTimeTV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setText("300000");
        mAlltime = Long.valueOf(getText().toString());
        Log.i(TAG, "CdTimeTV: "+getText().toString());
        start();
    }


    /**
     * 开始倒计时
     */
    public void start() {

        timer = new CountDownTimer(mAlltime + 1000, 1000) {
            @Override
            public void onTick(long mill) {
                //秒
                long ss = mill / 1000;
                //分
                long mm = ss / 60;
                //取余。秒
                long yy = ss % 60;

                setText(mm + ":" + yy);

                Log.i(TAG, mm + ":" + yy);
            }

            @Override
            public void onFinish() {
                setText("over");
            }
        };

        timer.start();
    }

    /**
     * 取消倒计时
     */
    public void stop() {
        timer.cancel();
    }
}
