package com.mycompany.mvp_rxjava_demo.user.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mycompany.mvp_rxjava_demo.R;
import com.mycompany.mvp_rxjava_demo.base.BaseFragment;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 * 登录的fragment
 */
public class LoginFragment extends BaseFragment implements LoginContract.View<LoginPresenter>, View.OnClickListener
{
    private LoginPresenter presenter;
    private EditText etUserName;
    private EditText etPassword;
    private Button btnLogin;
    public static LoginFragment newInstance()
    {
        return new LoginFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        etUserName = (EditText) view.findViewById(R.id.login_fragment_input_name);
        etPassword = (EditText) view.findViewById(R.id.login__fragment_input_password);
        btnLogin = (Button) view.findViewById(R.id.login_fragment_login);
        btnLogin.setOnClickListener(this);
        return view;
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }


    @Override
    public void setPresenter(LoginPresenter presenter)
    {
        this.presenter = presenter;
    }

    @Override
    public String getUserName()
    {
        return etUserName.getText().toString();
    }

    @Override
    public String getPassword()
    {
        return etPassword.getText().toString();
    }

    @Override
    public void login(String userName, String password)
    {
        presenter.login(userName, password);
    }

    @Override
    public void onClick(View v)
    {
        login(getUserName(),getPassword());
    }
}
