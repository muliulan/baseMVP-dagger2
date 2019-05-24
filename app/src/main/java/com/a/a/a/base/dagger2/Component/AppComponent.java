package com.a.a.a.base.dagger2.Component;

import com.a.a.a.base.MyApplication;
import com.a.a.a.base.dagger2.Module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2019/5/16 0016.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    MyApplication getContext();  // 提供App的Context
}

