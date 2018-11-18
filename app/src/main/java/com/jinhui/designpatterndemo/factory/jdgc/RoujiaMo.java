package com.jinhui.designpatterndemo.factory.jdgc;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class RoujiaMo {

    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        Log.e("---RoujiaMo:", name + ": 揉面-剁肉-完成准备工作");
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        Log.e("---RoujiaMo:", name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        Log.e("---RoujiaMo:", name + ": 肉夹馍-专用袋-包装---end");
    }



}
