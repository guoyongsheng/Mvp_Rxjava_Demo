package com.mycompany.mvp_rxjava_demo.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 * activity添加fragment的工具类
 */
public class ActivityUtils
{
    private ActivityUtils(){

    }


    public static void addFragmentToActivity(FragmentManager fragmentManager, int fragmentId, Fragment fragment)
    {
        if(fragmentManager == null || fragment == null)
        {
            return;
        }

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(fragmentId, fragment);
        fragmentTransaction.commit();
    }
}
