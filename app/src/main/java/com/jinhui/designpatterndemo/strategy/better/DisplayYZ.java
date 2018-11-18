package com.jinhui.designpatterndemo.strategy.better;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class DisplayYZ implements IDisplayBehavior{
    @Override
    public void display() {
        Log.e("---", "样子2");
    }
}
