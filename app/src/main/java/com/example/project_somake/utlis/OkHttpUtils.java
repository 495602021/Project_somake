package com.example.project_somake.utlis;


import com.example.project_somake.Intenfaces.HttpCallBack;
import com.example.project_somake.entity.HomeBean;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public class OkHttpUtils {
    private static OkHttpUtils okHttpUtils;
    private OkHttpClient okHttpClient;

    private OkHttpUtils() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    public static synchronized OkHttpUtils getInstance() {
        if (okHttpUtils == null)
            okHttpUtils = new OkHttpUtils();
        return okHttpUtils;
    }

    public void sendGet(String url, final HttpCallBack<HomeBean> callback) {
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.failure(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Gson gson = new Gson();
                HomeBean homeBean = gson.fromJson(response.body().string(), HomeBean.class);
                callback.success(homeBean);
            }
        });
    }


}
