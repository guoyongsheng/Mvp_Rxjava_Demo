package com.mycompany.mvp_rxjava_demo.user.login;

import com.mycompany.mvp_rxjava_demo.CustomSubscriber;
import com.mycompany.mvp_rxjava_demo.entitiy.Response;
import com.mycompany.mvp_rxjava_demo.entitiy.User;
import com.mycompany.mvp_rxjava_demo.listener.CallBackListener;
import com.mycompany.mvp_rxjava_demo.modle.user.ILoginService;
import com.mycompany.mvp_rxjava_demo.util.HttpManageUtils;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 */
public class LoginPresenter implements LoginContract.Presenter
{
    private ILoginService iLoginService;
    private LoginFragment view;
    public LoginPresenter(LoginFragment view)
    {
        this.view = view;
        view.setPresenter(this);
        iLoginService = (ILoginService) HttpManageUtils.getInstance().getService();
    }

    @Override
    public void login(String userName, String password)
    {

        CallBackListener<User> listener = new CallBackListener<User>()
        {
            @Override
            public void onFailed(String errorMessage)
            {

            }

            @Override
            public void onSuccess(User user)
            {

            }
        };
        CustomSubscriber<Response<User>,User> customSubscriber = new CustomSubscriber<>(listener);
        Subscription subscription = iLoginService.login(userName, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(customSubscriber);
        view.add(subscription);
    }

    @Override
    public void start()
    {

    }
}
