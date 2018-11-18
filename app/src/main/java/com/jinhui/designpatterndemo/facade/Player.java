package com.jinhui.designpatterndemo.facade;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 播放器
 */
public class Player {

    public void on() {
        Log.e("Player", "---打开播放器");
    }

    public void off() {
        Log.e("Player", "---关闭播放器");
    }

    public void make3DListener() {
        Log.e("Player", "---将播放器音调设为环绕立体声 ");
    }

}
