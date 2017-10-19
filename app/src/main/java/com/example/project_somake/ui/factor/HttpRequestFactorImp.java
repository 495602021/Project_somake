package com.example.project_somake.ui.factor;

import android.content.Context;

import com.example.project_somake.http.product.HttpRequest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * -------- This is 羊驼! -------
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * Created by 习爸爸 on 2017/09/22.
 */

public class HttpRequestFactorImp implements HttpRequestFactor {
    @Override
    public <T extends HttpRequest> HttpRequest create(Class<T> clz) {
        try {
            HttpRequest o = (HttpRequest) Class.forName(clz.getName()).newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public <T extends HttpRequest> HttpRequest create(Context context, Class<T> clz) {
        try {
            Class<?> aClass = Class.forName(clz.getName());
            Constructor<?> constructor = aClass.getConstructor(Context.class);
            HttpRequest o1 = (HttpRequest) constructor.newInstance(context);
            return o1;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
