package com.jinhui.designpatterndemo.facade;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class Light {

    public void down() {
        Log.e("Light", "---将灯光调暗");
    }

    public void up() {
        Log.e("Light", "---将灯光调亮");
    }

}
