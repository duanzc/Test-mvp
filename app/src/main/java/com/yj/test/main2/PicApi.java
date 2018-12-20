package com.yj.test.main2;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface PicApi {


    @GET("http://wallpaper.apc.360.cn/index.php?c=WallPaperAndroid&a=getAllCategories")
    Observable<PicBean> getPicType();
}
