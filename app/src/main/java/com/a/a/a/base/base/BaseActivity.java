package com.a.a.a.base.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.a.a.a.base.MyApplication;
import com.a.a.a.base.base.Interface.IPresenter;
import com.a.a.a.base.base.Interface.IView;
import com.a.a.a.base.dagger2.Component.ActivityComponent;
import com.a.a.a.base.dagger2.Component.DaggerActivityComponent;
import com.a.a.a.base.dagger2.Module.ActivityModule;

import javax.inject.Inject;

import butterknife.ButterKnife;


/**
 * Created by zcs on 2018/3/27 0027.
 */

public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IView {

    @Inject
    public P mPresenter;//presenter对象
    @Inject
    public MyApplication mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        initInject();
        if(mPresenter!=null){
            mPresenter.attachView(this);
        }
        initView(savedInstanceState);
    }

    protected ActivityComponent getActivityComponent(){
       return DaggerActivityComponent.builder()
               .appComponent(MyApplication.getAppComponent())
               .activityModule(new ActivityModule(this))
                .build();
    }

    @Override
    public Activity getContext() {
        return this;
    }

    @Override
    protected void onDestroy() {
        if(mPresenter!=null){
            mPresenter.detachView();
        }
        super.onDestroy();
    }
}
