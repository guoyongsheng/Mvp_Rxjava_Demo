package com.mycompany.mvp_rxjava_demo.base;

import android.app.Application;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 */
public class BaseApplication extends Application
{
    private static BaseApplication instance;
    @Override
    public void onCreate()
    {
        super.onCreate();
        instance = this;
    }

    public static BaseApplication getInstance()
    {
        return instance;
    }


    @Override
    public void onTrimMemory(int level)
    {
        super.onTrimMemory(level);

        switch (level)
        {
        case BIND_ABOVE_CLIENT:
            break;


        default:
            break;
        }
    }
}
