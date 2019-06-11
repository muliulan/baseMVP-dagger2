package com.a.a.a.base.presenter;

import android.util.Log;

import com.a.a.a.base.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public class LoginPresenter extends BasePresenter {
    private int a;

    @Inject
    public LoginPresenter(){}

//    @Inject
//    public LoginPresenter(ICommonView iView ,int a){
//        this.iView = iView;
//        this.a = a;
//    }

    public void login( ){
        Log.e("mlldddddddddd","dddddd"+a);
    }
}