package com.example.project_somake.http.factor;

import android.content.Context;

import com.example.project_somake.http.product.HttpRequest;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public interface FactorInterfaces {
    <T extends HttpRequest> HttpRequest creaate(Context context, Class<T> clz);

}
