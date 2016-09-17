package com.mycompany.mvp_rxjava_demo.entitiy;

/**
 * Created by lenovo on 2016/9/4.Mvp_Rxjava_Demo
 * 服务器返回的数据
 */
public class Response<T>
{
    private int errorCode;
    private String errorMessage;
    private T data;

    public int getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(int errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
