package com.a.a.a.base.dagger2;

import android.util.Log;

import com.a.a.a.base.base.BasePresenter;
import com.a.a.a.base.entity.User;

import javax.inject.Inject;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public class LoginPresenter extends BasePresenter {
    ICommonView iView;
    private int a;

    @Inject
    public LoginPresenter(){}

//    @Inject
//    public LoginPresenter(ICommonView iView ,int a){
//        this.iView = iView;
//        this.a = a;
//    }

    public void login(User user){
        Log.e("mlldddddddddd","dddddd"+a);
    }
}