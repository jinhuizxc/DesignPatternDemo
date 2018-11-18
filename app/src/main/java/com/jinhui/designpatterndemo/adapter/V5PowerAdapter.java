package com.jinhui.designpatterndemo.adapter;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 将200v家用电转换为5v手机用电的适配器
 */
public class V5PowerAdapter implements V5Power {

    private int v220power;

    public V5PowerAdapter(V220Power v220Power) {
        v220power = v220Power.provideV220Power();
    }

    public V5PowerAdapter() {

    }

    @Override
    public int provideV5Power() {
        Log.e("---", "适配器: 经过复杂的操作,将" + v220power + "v电压转为5v");
        return 5;
    }
}
