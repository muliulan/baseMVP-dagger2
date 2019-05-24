package com.a.a.a.base.http;

import com.a.a.a.base.Constants;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.request.GetRequest;
import com.lzy.okgo.request.PostRequest;

import java.util.Map;

/**
 * Created by Administrator on 2019/5/22 0022.
 */

public class MyOkGo {

    public static void Get(String url, Map<String, String> params,HttpCallback<String> httpcallback){
        GetRequest<String> tag = OkGo.<String>get(Constants.BASE_URL+url);
//               .tag(activity);
//              .headers("header1", "headerValue1")
        if(params!=null){
            tag.params(params);
        }
        tag.execute(httpcallback);
    }
    public static void Post(String url, Map<String, String> params,HttpCallback<String> httpcallback){
        PostRequest<String> tag = OkGo.<String>post(Constants.BASE_URL+url);
        if(params!=null){
            tag.params(params);
        }
        tag.execute(httpcallback);
    }

}
