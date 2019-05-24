package com.a.a.a.base.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/5/7 0007.
 */

public class User implements Serializable {
    /**
     * reason : 鎺ュ彛鍦板潃涓嶅瓨鍦�
     * result : null
     * error_code : 10022
     */

    private String reason;
    private Object result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}

