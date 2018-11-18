package com.jinhui.designpatterndemo.app;

import android.app.Application;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class PatternApplication extends Application {

    private static PatternApplication patternApplication;

    @Override
    public void onCreate() {
        super.onCreate();

       patternApplication = this;
    }

    public static PatternApplication getInstance() {
        if (patternApplication == null) {
            synchronized (PatternApplication.class) {
                if (patternApplication == null) {
                    patternApplication = new PatternApplication();
                }
            }
        }
        return patternApplication;
    }

}
