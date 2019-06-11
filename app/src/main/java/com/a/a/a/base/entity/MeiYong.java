package com.a.a.a.base.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2019/6/10 0010.
 */
@Entity
public class MeiYong {

    @Id
    private Long id;
    private String a;
    private String b;
    private String c;
    @Generated(hash = 225077112)
    public MeiYong(Long id, String a, String b, String c) {
        this.id = id;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Generated(hash = 1105327028)
    public MeiYong() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getA() {
        return this.a;
    }
    public void setA(String a) {
        this.a = a;
    }
    public String getB() {
        return this.b;
    }
    public void setB(String b) {
        this.b = b;
    }
    public String getC() {
        return this.c;
    }
    public void setC(String c) {
        this.c = c;
    }
}
