package com.mycompany.mvp_rxjava_demo.user.login;

import android.support.v4.app.FragmentManager;

import com.mycompany.mvp_rxjava_demo.R;
import com.mycompany.mvp_rxjava_demo.base.BaseActivity;
import com.mycompany.mvp_rxjava_demo.util.ActivityUtils;

public class LoginActivity extends BaseActivity
{
    private LoginFragment loginFragment;
    private FragmentManager fragmentManager;
    @Override
    public void initVariable()
    {
        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public void initView()
    {
        setContentView(R.layout.activity_main);
        loginFragment = (LoginFragment) fragmentManager.findFragmentById(R.id.frame_layout);
        if(loginFragment == null)
        {
            loginFragment = LoginFragment.newInstance();
            ActivityUtils.addFragmentToActivity(fragmentManager, R.id.frame_layout, loginFragment);
        }
    }

    @Override
    public void initPresenter()
    {
        new LoginPresenter(loginFragment);
    }
}
