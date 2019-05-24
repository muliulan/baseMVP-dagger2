package com.a.a.a.base.dagger2.Component;

import android.app.Activity;

import com.a.a.a.base.dagger2.scope.ActivityScope;
import com.a.a.a.base.dagger2.Module.ActivityModule;
import com.a.a.a.base.view.activity.MainActivity;

import dagger.Component;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

@ActivityScope
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
    void inject(MainActivity activity );
}
