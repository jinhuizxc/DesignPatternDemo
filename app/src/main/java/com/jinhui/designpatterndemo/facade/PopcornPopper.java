package com.jinhui.designpatterndemo.facade;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 爆米花机
 */
public class PopcornPopper {

    public void on() {
        Log.e("PopcornPopper", "---打开爆米花机");
    }

    public void off() {
        Log.e("PopcornPopper", "---关闭爆米花机");
    }

    public void makePopcorn() {
        Log.e("PopcornPopper", "---制作爆米花");
    }

}
