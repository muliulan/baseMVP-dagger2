package com.a.a.a.base.base;

import com.a.a.a.base.base.Interface.IPresenter;
import com.a.a.a.base.base.Interface.IView;
import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by zcs on 2018/3/27 0027.
 */

public abstract class BasePresenter<V extends IView> implements IPresenter <V> {

    protected V mView;

    @Override
    public void attachView(V view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    public static <T>T getJsonList(String json,Class<T> c){
        List<T> parseArray = JSON.parseArray(json,c);
        return (T) parseArray;
    }

    public static <T>T getEntity(String json,Class<T> c){
        return JSON.parseObject(json, c);
    }


}
