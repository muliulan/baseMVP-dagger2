package com.a.a.a.base.dagger2.Component;

import com.a.a.a.base.MyApplication;
import com.a.a.a.base.dagger2.Module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2019/5/16 0016.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    MyApplication getContext();  // 提供App的Context

//    DataManager getDataManager(); //数据中心
//
//    RetrofitHelper retrofitHelper();  //提供http的帮助类
//
//    RealmHelper realmHelper();    //提供数据库帮助类
//
//    ImplPreferencesHelper preferencesHelper(); //提供sp帮助类
}

