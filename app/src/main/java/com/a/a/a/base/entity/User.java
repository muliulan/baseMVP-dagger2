package com.a.a.a.base.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public class User implements Serializable {
    private int id;
    private String userName;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}

