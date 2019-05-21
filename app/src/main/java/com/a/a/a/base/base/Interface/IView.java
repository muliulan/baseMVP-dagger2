package com.a.a.a.base.base.Interface;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public interface IView {
    Activity getContext();

    /**
     * @return  获取布局id
     */
    int getLayout();

    /**
     * 添加 对象
     */
    void  initInject();

    /**
     * @param savedInstanceState 初始化
     */
    void initView(Bundle savedInstanceState);
}
