package com.wuyue.screenadaptation.com.wuyue.main;

import android.app.Activity;
import android.app.Application;

import java.util.List;

/**
 * @author wuyue
 * @date 2015/10/27
 * @time 14:46
 */
public class WYScreenAppliaction extends Application{
    private volatile static WYScreenAppliaction mSharedApplication;

    private List<Activity> mBaseActivities;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static WYScreenAppliaction getInstance() {
        return mSharedApplication;
    }
}
