package com.a.a.a.base.dagger2.Module;

import com.a.a.a.base.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2019/5/16 0016.
 */
@Module
public class AppModule {
    private  MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    MyApplication provideApplicationContext() {
        return application;
    }

}
