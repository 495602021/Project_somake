package com.example.project_somake.utlis;

import com.example.project_somake.concat.Concat;
import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public class RetrofitsUtlis {
    private static RetrofitsUtlis utils;
    private Retrofit retrofit;

    private RetrofitsUtlis() {
        retrofit = new Retrofit
                .Builder()
                .baseUrl(Concat.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static RetrofitsUtlis getInstance() {
        if (utils == null) {
            synchronized (RetrofitsUtlis.class) {
                if (utils == null) {
                    utils = new RetrofitsUtlis();
                }
            }
        }

        return utils;

    }

    public <T> T create(final Class<T> service) {

        return retrofit.create(service);
    }

}
