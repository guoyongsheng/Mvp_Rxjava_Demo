package com.mycompany.mvp_rxjava_demo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 */
public class BaseFragment extends Fragment
{
    protected CompositeSubscription compositeSubscription;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
        if(compositeSubscription != null)
        {
            compositeSubscription.unsubscribe();    //用于取消请求
        }
    }


    public void add(Subscription subscription)
    {
        if(compositeSubscription == null)
        {
            compositeSubscription = new CompositeSubscription();
        }
        compositeSubscription.add(subscription);
    }
}
