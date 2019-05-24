package com.a.a.a.base.Interface;

import com.a.a.a.base.base.Interface.IPresenter;
import com.a.a.a.base.base.Interface.IView;

/**
 * Created by Administrator on 2019/5/13 0013.
 */

public interface MainContract{
    interface View extends IView{
        void main();
    }
    interface Presenter extends IPresenter<View>{
        void presenter();
    }

}
