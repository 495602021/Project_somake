package com.example.project_somake.Intenfaces;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public interface HttpCallBack<T> {
    void success(T t);

    void failure();
}
