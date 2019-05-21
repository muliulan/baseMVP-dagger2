package com.a.a.a.base.dagger2;

import android.util.Log;

import com.a.a.a.base.Interface.MainInterface;
import com.a.a.a.base.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Administrator on 2019/5/9 0009.
 */

public class MyP  extends BasePresenter<MainInterface>{

    @Inject
    public MyP() {
    }

    public void asd(){
        if(mContext!=null){
            Log.e("mll","mContext 不为NUll");
        }
        Log.e("mll","asd");
        iView.main();
    }

    public void I_P() {
        Log.e("mll","I_P");
    }
}
