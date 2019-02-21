package com.yj.mvp_lib.base;

import android.view.View;

/**
 * 作者: 司海林
 * 时间: 16/2/22
 * 邮箱: 371184359@qq.com
 * 描述: 点击长按的接口
 */
public interface OnItemClickListener {
    void onItemClick(View view, int position);
    void onItemLongClick(View view, int position);
}
