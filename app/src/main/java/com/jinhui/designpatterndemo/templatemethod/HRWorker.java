package com.jinhui.designpatterndemo.templatemethod;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * HR
 */
public class HRWorker extends Worker{

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ", 看简历 - 打电话 - 接电话");
    }
}
