package com.google.reminder;

import android.app.Application;

/**
 * Created by Sergey on 13.12.2015.
 */
public class MyApplication extends Application {

    private static boolean activityVisible;

    public static boolean isActivityVisible(){
        return activityVisible;
    }

    public static void activityResumed(){
        activityVisible = true;
    }

    public static void activityPaused(){
        activityVisible = false;
    }
}
