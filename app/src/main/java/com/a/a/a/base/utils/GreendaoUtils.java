package com.a.a.a.base.utils;

import com.a.a.a.base.MyApplication;
import com.a.a.a.base.greendao.DaoSession;

import java.util.List;

/**
 * Created by Administrator on 2019/6/10 0010.
 */

public class GreendaoUtils {

    /** 查
     */
    public static  <T> List<T> loadAll(Class<T> c){
        DaoSession daoSession = MyApplication.getDaoSession();
        List<T> ts = daoSession.loadAll(c);
        return ts;
    }

    /** 增
     */
    public static <T> void  insertOrReplace(Class<T> c){
        DaoSession daoSession = MyApplication.getDaoSession();
        daoSession.insertOrReplace(c);
    }

    /** 删
     */
    public static <T> void  deleteData(Class<T> c){
        DaoSession daoSession = MyApplication.getDaoSession();
        daoSession.delete(c);
    }

    /** 改
     */
    public static <T> void  updateData(Class<T> c){
        DaoSession daoSession = MyApplication.getDaoSession();
        daoSession.update(c);
    }



}
