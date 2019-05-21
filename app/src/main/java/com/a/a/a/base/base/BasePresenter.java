package com.a.a.a.base.base;

import android.content.Context;

import com.a.a.a.base.base.Interface.IPresenter;
import com.a.a.a.base.base.Interface.IView;

/**
 * Created by zcs on 2018/3/27 0027.
 */

public abstract class BasePresenter<V extends IView> implements IPresenter <V> {

    public Context mContext;
    public V iView;

    @Override
    public void attachView(V view) {
        this.iView = view;
        mContext=this.iView.getContext();
    }

    @Override
    public void detachView() {
        this.iView = null;
    }



//    public Reference<T> vIn;
//    public void  attachView(T in){
//        vIn = new WeakReference<>(in);
//    }
//    public boolean isViewAttached(){
//        return  vIn !=null && vIn.get() !=null;
//    }
//    public T getViewIn(){
//        if( isViewAttached()){
//            return vIn.get();
//        }
//        return null;
//    }
//    public  void detachView(){
//        if(vIn!=null){
//            vIn.clear();
//            vIn =null;
//        }
//    }
}
