package com.fuicuiedu.idedemo.interview_jiguang;

import android.app.Application;
import android.app.Notification;

import cn.jpush.android.api.BasicPushNotificationBuilder;
import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2016/11/14 0014.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
