package com.a.a.a.base.dagger2.Module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.a.a.a.base.dagger2.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by codeest on 16/8/7.
 */

@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @FragmentScope
    public Activity provideActivity() {
        return fragment.getActivity();
    }
}
