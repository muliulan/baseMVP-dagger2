package com.a.a.a.base.view.fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.a.a.a.base.R;
import com.a.a.a.base.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by Administrator on 2019/5/13 0013.
 */

public class O4Fragment extends BaseFragment {

    @BindView(R.id.text)
    TextView text;

    @Override
    public int getLayout() {
        return R.layout.fragment;
    }

    @Override
    public void initInject() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {
        text.setText("44");
    }
}
