package com.a.a.a.base.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

import com.a.a.a.base.Interface.MainContract;
import com.a.a.a.base.R;
import com.a.a.a.base.base.MvpActivity;
import com.a.a.a.base.entity.TabEntity;
import com.a.a.a.base.presenter.MainPresenter;
import com.a.a.a.base.view.fragment.O1Fragment;
import com.a.a.a.base.view.fragment.O2Fragment;
import com.a.a.a.base.view.fragment.O3Fragment;
import com.a.a.a.base.view.fragment.O4Fragment;
import com.blankj.utilcode.util.ToastUtils;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;

import java.util.ArrayList;

import butterknife.OnClick;

public class MainActivity extends MvpActivity<MainPresenter> implements MainContract.View {


    @OnClick(R.id.text)
    public void dd(View v){
        switch (v.getId()){
            case R.id.text:
                ToastUtils.showShort("点击了");
                break;
        }

    }


    private String[] mTitles = {"首页", "消息", "联系人", "更多"};
    private int[] mIconUnselectIds = {
            R.mipmap.tab_home_unselect, R.mipmap.tab_speech_unselect,
            R.mipmap.tab_contact_unselect, R.mipmap.tab_more_unselect};
    private int[] mIconSelectIds = {
            R.mipmap.tab_home_select, R.mipmap.tab_speech_select,
            R.mipmap.tab_contact_select, R.mipmap.tab_more_select};
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    public void initView(Bundle savedInstanceState) {

        mPresenter.asd();
        mPresenter.presenter();
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        mFragments.add(new O1Fragment());
        mFragments.add(new O2Fragment());
        mFragments.add(new O3Fragment());
        mFragments.add(new O4Fragment());
        CommonTabLayout tl_1 = findViewById(R.id.tl_1);
        tl_1.setTabData(mTabEntities, this, R.id.frame_layout, mFragments);

    }

    @Override
    public void main() {
        Log.e("mll","main");
    }
}
