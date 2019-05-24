package com.a.a.a.base.http.text;

import android.graphics.Bitmap;
import android.util.Log;

import com.a.a.a.base.http.Convert;
import com.lzy.okgo.model.Response;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;

/**
 * Created by Administrator on 2019/5/22 0022.
 */

public class HttpLog {

    public static  <T> void handleResponse(Response<T> response) {
        StringBuilder sb;
        Call call = response.getRawCall();
        if (call != null) {
            Log.e("成功请求方式",call.request().method() + "\n");
//            Headers requestHeadersString = call.request().headers();
//            Set<String> requestNames = requestHeadersString.names();
//            sb = new StringBuilder();
//            for (String name : requestNames) {
//                sb.append(name).append(" ： ").append(requestHeadersString.get(name)).append("\n");
//            }
//           Log.e("请求头",sb.toString());
        } else {
            Log.e("成功","call 为null");
        }
        T body = response.body();
        if (body == null) {
            Log.e("成功","body空");
        } else {
            if (body instanceof String) {
                Log.e("成功返回类型string",body.toString());
            } else if (body instanceof List) {
                sb = new StringBuilder();
                List list = (List) body;
                for (Object obj : list) {
                    sb.append(obj.toString()).append("\n");
                }
                Log.e("成功返回类型list",sb.toString());
            } else if (body instanceof Set) {
                sb = new StringBuilder();
                Set set = (Set) body;
                for (Object obj : set) {
                    sb.append(obj.toString()).append("\n");
                }
                Log.e("成功返回类型Set",sb.toString());
            } else if (body instanceof Map) {
                sb = new StringBuilder();
                Map map = (Map) body;
                Set keySet = map.keySet();
                for (Object key : keySet) {
                    sb.append(key.toString()).append(" ： ").append(map.get(key)).append("\n");
                }
                Log.e("成功返回类型map",sb.toString());
            } else if (body instanceof File) {
                File file = (File) body;
                Log.e("成功返回类型File","文件下载路径: "+file.getAbsolutePath());
            } else if (body instanceof Bitmap) {
                Log.e("成功返回类型Bitmap","图片的内容即为数据");
            } else {
                Log.e("成功返回类型不确定",Convert.formatJson(body));
            }
        }

        okhttp3.Response rawResponse = response.getRawResponse();
        if (rawResponse != null) {
//            Headers responseHeadersString = rawResponse.headers();
//            Set<String> names = responseHeadersString.names();
            sb = new StringBuilder();
            sb.append("url ： ").append(rawResponse.request().url()).append("");
            sb.append("    stateCode ： ").append(rawResponse.code()).append("\n");
//            for (String name : names) {
//                sb.append(name).append(" ： ").append(responseHeadersString.get(name)).append("\n");
//            }
            Log.e("成功状态",sb.toString());
        } else {
            Log.e("成功","rawResponse为空");
        }
    }
    public static <T> void handleError(Response<T> response) {
        if (response == null) return;
        if (response.getException() != null) response.getException().printStackTrace();
        StringBuilder sb;
        Call call = response.getRawCall();
        if (call != null) {
            Log.e("失败请求方式", call.request().method() + "\n" );
//            Headers requestHeadersString = call.request().headers();
//            Set<String> requestNames = requestHeadersString.names();
//            sb = new StringBuilder();
//            for (String name : requestNames) {
//                sb.append(name).append(" ： ").append(requestHeadersString.get(name)).append("\n");
//            }
//            Log.e("请求失败",sb.toString());
        } else {
            Log.e("请求失败","call为null");
        }
        okhttp3.Response rawResponse = response.getRawResponse();
        if (rawResponse != null) {
//            Headers responseHeadersString = rawResponse.headers();
//            Set<String> names = responseHeadersString.names();
            sb = new StringBuilder();
            sb.append("stateCode ： ").append(rawResponse.code()).append("\n");
//            for (String name : names) {
//                sb.append(name).append(" ： ").append(responseHeadersString.get(name)).append("\n");
//            }
            Log.e("失败状态",sb.toString());
        } else {
            Log.e("失败","rawResponse为null");
        }
    }
}
