package com.a.a.a.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.a.a.a.base.dagger2.Component.AppComponent;
import com.a.a.a.base.dagger2.Component.DaggerAppComponent;
import com.a.a.a.base.dagger2.Module.AppModule;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public class MyApplication extends Application{

    public static AppComponent appComponent;
    public static  MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;

    }

    public static AppComponent getAppComponent(){
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(myApplication))
                    .build();
        }
        return appComponent;
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
}
