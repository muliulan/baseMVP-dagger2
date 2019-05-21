package com.a.a.a.base.dagger2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.a.a.a.base.entity.User;

import javax.inject.Inject;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public class LoginActivity extends AppCompatActivity implements ICommonView {
    Button btn;


    @Inject
    LoginPresenter presenter;
    @Inject
    MyP mp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn= new Button(getApplicationContext());
        btn.setText("111111111111111111");
        setContentView(btn);
        btn.setText("111111111111111111");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login(new User());
            }
        });
//        com.a.a.a.base.dagger2.Component.DaggerCommonComponent
//                .builder()
//
//                .build()
//                .inject(this);
// .daggerModule(new DaggerModule(this,111))


        mp.I_P();

    }


    @Override
    public Context getContext() {
        return this;
    }
}