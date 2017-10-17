package com.example.project_somake.utlis;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by 九九乘法表呀一乘一得一呀 on 2017/10/17.
 */
public class VolleyUtlis {
    private static VolleyUtlis utlis;
    private RequestQueue queue;

    private VolleyUtlis(Context context) {
        queue = Volley.newRequestQueue(context);
    }

    public static VolleyUtlis getIntences(Context context) {
        if (utlis == null) {
            synchronized (VolleyUtlis.class) {
                if (utlis == null) {
                    utlis = new VolleyUtlis(context);
                }

            }
        }
        return utlis;
    }

    public <T> Request<T> add(Request<T> request) {
        return queue.add(request);
    }

}
