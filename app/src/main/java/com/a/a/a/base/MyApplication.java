package com.a.a.a.base;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.multidex.MultiDex;

import com.a.a.a.base.dagger2.Component.AppComponent;
import com.a.a.a.base.dagger2.Component.DaggerAppComponent;
import com.a.a.a.base.dagger2.Module.AppModule;
import com.a.a.a.base.greendao.DaoMaster;
import com.a.a.a.base.greendao.DaoSession;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public class MyApplication extends Application{

    private static AppComponent appComponent;
    public static  MyApplication myApplication;
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        initGreenDao();
    }

    public static AppComponent getAppComponent(){
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(myApplication))
                    .build();
        }
        return appComponent;
    }

    private void initGreenDao() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "aserbao.db");
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }


    public static DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
}
