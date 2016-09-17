package com.mycompany.mvp_rxjava_demo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 */
public abstract class BaseActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initVariable();
        initView();
        initPresenter();
    }


    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    public abstract void initVariable();

    public abstract void initView();

    public abstract void initPresenter();
}
