package com.a.a.a.base.dagger2.Module;

import android.app.Activity;

import com.a.a.a.base.dagger2.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2019/5/14 0014.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }
}
