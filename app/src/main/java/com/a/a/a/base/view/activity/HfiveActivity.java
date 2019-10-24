package com.a.a.a.base.view.activity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.a.a.a.base.R;
import com.a.a.a.base.base.MvpActivity;
import com.github.lzyzsd.jsbridge.BridgeHandler;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.CallBackFunction;
import com.github.lzyzsd.jsbridge.DefaultHandler;

import butterknife.BindView;

/**
 * Created by Administrator on 2019/7/10 0010.
 */

public class HfiveActivity extends MvpActivity {

    @BindView(R.id.webview_wv)
    BridgeWebView webviewWv;

    @Override
    public int getLayout() {
        return R.layout.hfive_activity;
    }

    @Override
    public void initInject() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {

        webviewConfig(webviewWv);
        js();
    }
    private void webviewConfig(WebView webView) {
        webviewWv.setDefaultHandler(new DefaultHandler());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        //settings.setPluginsEnabled(true);
        /***打开本地缓存提供JS调用**/
        webView.getSettings().setDomStorageEnabled(true);
        // This next one is crazy. It's the DEFAULT location for your app's cache
        // But it didn't work for me without this line.
        // UPDATE: no hardcoded path. Thanks to Kevin Hawkins
        String appCachePath = getApplicationContext().getCacheDir().getAbsolutePath();
        webView.getSettings().setAppCachePath(appCachePath);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAppCacheEnabled(true);
        // Set cache size to 8 mb by default. should be more than enough
        webView.getSettings().setAppCacheMaxSize(1024 * 1024 * 8);
        //启用数据库
        webView.getSettings().setDatabaseEnabled(true);
        //启用地理定位
        webView.getSettings().setGeolocationEnabled(true);
        //设置在WebView内部是否允许访问文件，默认允许访问。
        webView.getSettings().setAllowFileAccess(true);
        String localVersion = "";
        try {
            PackageInfo packageInfo =  getApplicationContext()
                    .getPackageManager()
                    .getPackageInfo( getPackageName(), 0);
            localVersion = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        //UA
//        String ua = settings.getUserAgentString();
//        settings.setUserAgentString(ua +"android_wondercv_app"+"&android_app_version="+localVersion);
//        Log.e("hfive_activity","UA2 = "+settings.getUserAgentString());
    }

    public void js(){
        //接受 接受js发送的数据
        webviewWv.registerHandler("shareImage", new BridgeHandler() {
            @Override
            public void handler(String data, CallBackFunction function) {
                Log.e("图片", data);

            }
        });
        //给js发送数据
//        webviewWv.callHandler("functionInJs", new Gson().toJson(user), new CallBackFunction() {
//            @Override
//            public void onCallBack(String data) {
//
//            }
//        });
    }
}
