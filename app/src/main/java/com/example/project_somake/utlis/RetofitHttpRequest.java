package com.example.project_somake.utlis;


import android.util.Log;

import com.example.project_somake.Intenfaces.HttpCallBack;
import com.example.project_somake.apis.ApisNew;
import com.example.project_somake.http.product.HttpRequest;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

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
 * Created by 习爸爸 on 2017/9/28.
 */

public class RetofitHttpRequest<T> implements HttpRequest<T> {


    @Override
    public void post(String url, final Type type, Map<String, String> mParams, final HttpCallBack<T> callBack) {
        //使用Retrofit进行网络请求
        ApisNew apisNew = RetrofitsUtlis.getInstance().create(ApisNew.class);
        Observable<ResponseBody> post = apisNew.post(url, mParams);
        post.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResponseBody responseBody) {

                        try {
                            String string = responseBody.string();
                            Log.e("TAG",string);
                            //TODO 注意这个地方：

                            Gson gson = new Gson();
                            T t = gson.fromJson(string,type);
                            callBack.success(t);
                        } catch (IOException e) {
                            e.printStackTrace();
                            callBack.failure(e);
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        callBack.failure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void get(String url, Type type, HttpCallBack<T> callBack) {

    }
}
