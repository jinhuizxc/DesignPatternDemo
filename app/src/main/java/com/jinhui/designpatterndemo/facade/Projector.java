package com.jinhui.designpatterndemo.facade;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 投影仪
 *
 */
public class Projector {

    public void on() {
        Log.e("Projector", "---打开投影仪");
    }

    public void off() {
        Log.e("Projector", "---关闭投影仪");
    }

    public void close() {
        Log.e("Projector", "---收起投影仪投影区");
    }

    public void open() {
        Log.e("Projector", "---放下投影仪投影区");
    }

}
