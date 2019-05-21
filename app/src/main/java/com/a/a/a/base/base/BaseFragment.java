package com.a.a.a.base.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a.a.a.base.MyApplication;
import com.a.a.a.base.base.Interface.IPresenter;
import com.a.a.a.base.base.Interface.IView;
import com.a.a.a.base.dagger2.Component.DaggerFragmentComponent;
import com.a.a.a.base.dagger2.Component.FragmentComponent;
import com.a.a.a.base.dagger2.Module.FragmentModule;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public abstract class  BaseFragment<P extends IPresenter>  extends Fragment implements IView {

    @Inject
    public P mPresenter;//presenter对象

    private View inflate;
    private Unbinder unbinder;

    @Override
    public Activity getContext() {
        return getActivity();
    }

    protected FragmentComponent getFragmentComponent(){
        return DaggerFragmentComponent.builder()
                .appComponent(MyApplication.getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(getLayout(), container, false);
        unbinder = ButterKnife.bind(this, inflate);
        initInject();
        initView(savedInstanceState);
        return inflate;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
