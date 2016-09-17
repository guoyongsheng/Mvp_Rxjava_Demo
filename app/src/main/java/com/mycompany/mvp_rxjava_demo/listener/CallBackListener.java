package com.mycompany.mvp_rxjava_demo.listener;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 */
public interface CallBackListener<T>
{
    void onFailed(String errorMessage);

    void onSuccess(T t);
}
