package com.mycompany.mvp_rxjava_demo.base;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 */
public interface BaseView<T>
{
    void setPresenter(T presenter);
}
