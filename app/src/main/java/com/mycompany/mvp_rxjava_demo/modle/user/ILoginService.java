package com.mycompany.mvp_rxjava_demo.modle.user;

import com.mycompany.mvp_rxjava_demo.entitiy.Response;
import com.mycompany.mvp_rxjava_demo.entitiy.User;
import com.mycompany.mvp_rxjava_demo.modle.IService;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 */
public interface ILoginService extends IService
{
    @GET("user/login")
    Observable<Response<User>> login(@Query("userName") String userName, @Query("password") String password);
}
