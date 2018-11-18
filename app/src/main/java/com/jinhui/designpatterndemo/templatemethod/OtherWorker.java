package com.jinhui.designpatterndemo.templatemethod;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 一些自由人员
 */
public class OtherWorker extends Worker {

    public OtherWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ",打LOL...");
    }
}
