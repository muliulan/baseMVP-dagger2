package com.a.a.a.base.http;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Window;

import com.a.a.a.base.http.text.HttpLog;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

/**
 * Created by Administrator on 2019/5/22 0022.
 */

public abstract class HttpCallback<T> extends JsonCallback<T> {

    private ProgressDialog dialog;

    private void initDialog(Activity activity) {
        dialog = new ProgressDialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setMessage("请求网络中...");
    }

    public HttpCallback(Activity activity) {
        super();
        initDialog(activity);
    }

    @Override
    public void onStart(Request<T, ? extends Request> request) {
        if (dialog != null && !dialog.isShowing()) {
            dialog.show();
        }
    }

    @Override
    public void onSuccess(Response<T> response) {
        HttpLog.handleResponse(response);
    }

    @Override
    public void onError(Response<T> response) {
        super.onError(response);
        HttpLog.handleError(response);
    }

    @Override
    public void onFinish() {
        //网络请求结束后关闭对话框
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
