package com.mycompany.mvp_rxjava_demo.user.login;

import com.mycompany.mvp_rxjava_demo.base.BasePresenter;
import com.mycompany.mvp_rxjava_demo.base.BaseView;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 * 登录的协议接口
 */
public interface LoginContract
{
    interface View<LoginPresenter> extends BaseView<LoginPresenter>
    {
        String getUserName(); //获取用户名
        String getPassword(); //获取密码
        void login(String userName, String password); //登录
    }


    interface Presenter extends BasePresenter
    {
        void login(String userName, String password); //登录
    }
}
