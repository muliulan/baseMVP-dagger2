package com.a.a.a.base;

/**
 * Created by Administrator on 2019/5/16 0016.
 */

public class Constants {
    public static final int type =1;
    public final static  String BASE_URL;

    static{
        if(type==1){
            BASE_URL = "http://v.juhe.cn/toutiao/index";
        }else{
            BASE_URL = "http://v.juhe11.cn/toutiao/index";
        }
    }

    public static final String TYPE_ZHIHU = "?wd=安卓";

    public static final String JU_HE_APP_KEY = "799b785ba7b97223be80534651dd0d63";



}
