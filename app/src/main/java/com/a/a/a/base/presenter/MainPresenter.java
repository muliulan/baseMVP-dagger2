package com.a.a.a.base.presenter;

import com.a.a.a.base.Interface.MainContract;
import com.a.a.a.base.base.BasePresenter;
import com.a.a.a.base.http.HttpCallback;
import com.a.a.a.base.http.MyOkGo;
import com.lzy.okgo.model.Response;

import javax.inject.Inject;

/**
 * Created by Administrator on 2019/5/9 0009.
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter{

    @Inject
    public MainPresenter() { }

    public void asd(){
        mView.main();
    }

    @Override
    public void presenter() {
        MyOkGo.Get("", null, new HttpCallback<String>(mView.getContext()) {
            @Override
            public void onSuccess(Response<String> response) {
                super.onSuccess(response);
            }
        });


   }
}
