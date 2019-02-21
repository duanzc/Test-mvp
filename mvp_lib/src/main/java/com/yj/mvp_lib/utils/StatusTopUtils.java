package com.yj.mvp_lib.utils;

import android.content.Context;

/**
 * 获取状态栏高度
 * @date 2019-2-20 15:29:37
 */
public class StatusTopUtils {

    public static int getStatusTopSize(Context context){
        int result=0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
