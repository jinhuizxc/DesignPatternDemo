package com.jinhui.designpatterndemo.adapter;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class Mobile {

    // 这里传入的是 v5接口,实现了这个接口的类也可以传入
    public void inputPower(V5Power v5Power) {
        int provideV5Power = v5Power.provideV5Power();
        Log.e("---", "手机(客户端): 我需要的是5V电压充电,现在是" + provideV5Power + "V");
    }
}
