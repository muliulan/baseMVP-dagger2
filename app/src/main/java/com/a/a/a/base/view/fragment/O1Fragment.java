package com.a.a.a.base.view.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.a.a.a.base.Cezz;
import com.a.a.a.base.R;
import com.a.a.a.base.base.BaseFragment;
import com.a.a.a.base.dagger2.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2019/5/13 0013.
 */

public class O1Fragment extends BaseFragment<LoginPresenter> {
    @BindView(R.id.text)
    TextView text;
    @Inject
    Cezz c;

    @Override
    public int getLayout() {
        return R.layout.fragment;
    }

    @Override
    public void initInject() {
        getFragmentComponent().inject(this);
    }

    @Override
    public void initView(Bundle savedInstanceState) {

        if(mPresenter!=null){
            mPresenter.login(null);
        }
        if(c==null){
            Log.e("dddddddddd","aa");
        }else{
            Log.e("dddddddddd","aa1111");

        }

        text.setText(String.valueOf(11));
    }
    @OnClick(R.id.text)
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.text:


                break;
        }


    }
}
