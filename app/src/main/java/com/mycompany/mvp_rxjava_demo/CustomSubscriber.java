package com.mycompany.mvp_rxjava_demo;

import android.app.ProgressDialog;

import com.mycompany.mvp_rxjava_demo.base.BaseApplication;
import com.mycompany.mvp_rxjava_demo.entitiy.Response;
import com.mycompany.mvp_rxjava_demo.listener.CallBackListener;

import rx.Subscriber;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 * 自定义回调
 */
public class CustomSubscriber<T extends Response<K>, K> extends Subscriber<T>
{
    private ProgressDialog progressDialog;
    private CallBackListener<K> listener;
    public CustomSubscriber(CallBackListener<K> listener)
    {
        this.listener = listener;
        if(progressDialog == null)
        {
            progressDialog = new ProgressDialog(BaseApplication.getInstance());
        }
    }
    @Override
    public void onCompleted()
    {
        hideProgressDialog();
    }

    @Override
    public void onError(Throwable e)
    {
        hideProgressDialog();
    }

    @Override
    public void onNext(T t)
    {
        int errorCode = t.getErrorCode();
        switch (errorCode)
        {
        case 0:
            break;

        case 1:
            break;

        case 200:
            listener.onSuccess(t.getData());
            break;


        default:
            break;
        }
    }

    @Override
    public void onStart()
    {
        showProgressDialog();
    }


    //显示对话框
    private void showProgressDialog()
    {
        if(progressDialog != null && !progressDialog.isShowing())
        {
            progressDialog.show();
        }
    }


    //隐藏对话框
    private void hideProgressDialog()
    {
        if(progressDialog != null && progressDialog.isShowing())
        {
            progressDialog.dismiss();
        }
    }

}
