package com.example.project_somake.http.product;

import com.example.project_somake.Intenfaces.HttpCallBack;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public interface HttpRequest<T> {
    void post(String url, Type type, Map<String, String> mParams, HttpCallBack<T> callBack);

    void get(String url, Type type, HttpCallBack<T> callBack);
}
