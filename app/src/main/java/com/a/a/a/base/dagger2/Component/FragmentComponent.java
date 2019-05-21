package com.a.a.a.base.dagger2.Component;

import com.a.a.a.base.dagger2.FragmentScope;
import com.a.a.a.base.dagger2.Module.FragmentModule;
import com.a.a.a.base.view.fragment.O1Fragment;

import dagger.Component;

/**
 * Created by Administrator on 2019/5/15 0015.
 */
@FragmentScope
@Component(dependencies = AppComponent.class,modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(O1Fragment fragment );
}
