package com.mycompany.mvp_rxjava_demo.util;

import com.mycompany.mvp_rxjava_demo.config.Config;
import com.mycompany.mvp_rxjava_demo.modle.IService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 * 工具类
 */
public class HttpManageUtils
{

    private static volatile HttpManageUtils instance;
    private IService iService;
    private HttpManageUtils()
    {
        Retrofit retrofit = new Retrofit.Builder()
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .baseUrl(Config.BASE_URL)
                            .build();
        iService = retrofit.create(IService.class);
    }

    //单例模式
    public static HttpManageUtils getInstance()
    {
        if(instance == null)
        {
            synchronized (HttpManageUtils.class)
            {
                if(instance == null)
                {
                    instance = new HttpManageUtils();
                }
            }
        }
        return instance;
    }


    public IService getService()
    {
        return iService;
    }
}
