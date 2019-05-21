package com.a.a.a.base.base.Interface;

/**
 * Created by Administrator on 2019/5/9 0009.
 */

public interface IPresenter <V extends IView>{

        void attachView(V view);

        void detachView();

}
