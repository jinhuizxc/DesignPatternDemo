package com.jinhui.designpatterndemo.command;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 电脑
 */
public class Computer {

    public void on() {
        Log.e("Computer:", "---打开电脑");
    }

    public void off() {
        Log.e("Computer:", "---关闭电脑");
    }
}
