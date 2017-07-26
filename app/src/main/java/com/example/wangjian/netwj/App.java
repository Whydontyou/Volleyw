package com.example.wangjian.netwj;

import android.app.Application;

import com.example.netwj.IRequest;

/**
 * Created by wangjian on 2017/7/26.
 */

public class App extends Application{
    private static Application mInstance;
    private static IRequest sIRequest;
    public static IRequest getRequestInstance() {
        return sIRequest;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        sIRequest = new IRequest(this);
    }
}
