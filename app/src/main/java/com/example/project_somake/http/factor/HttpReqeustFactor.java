package com.example.project_somake.http.factor;

import android.content.Context;

import com.example.project_somake.http.product.HttpRequest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public class HttpReqeustFactor {
    public <T extends HttpRequest> HttpRequest create(Context context, Class<T> cls) {
        try {
            Class<?> aClass = Class.forName(cls.getName());
            Constructor<?> constructor = aClass.getConstructor(Context.class);
            HttpRequest o = (HttpRequest) constructor.newInstance(context);
            return  o;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }

    }

}
