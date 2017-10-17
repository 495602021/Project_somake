package com.example.project_somake.utlis;


import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public class OkhttpUtlis {
    private static OkhttpUtlis utlis;
    private OkHttpClient okHttpClient;

    private OkhttpUtlis() {
        okHttpClient = new OkHttpClient();
    }

    public static synchronized OkhttpUtlis getInstence() {
        if (utlis == null)
            utlis = new OkhttpUtlis();
        return utlis;
    }

    public Call newCall(Request request) {
        return okHttpClient.newCall(request);
    }
}
