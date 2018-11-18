package com.jinhui.designpatterndemo.command;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 电灯
 */
public class Light {

    public void on() {
        Log.e("Light:", "---打开灯");
    }

    public void off() {
        Log.e("Light:", "---关闭灯");
    }
}
