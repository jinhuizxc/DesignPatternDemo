package com.jinhui.designpatterndemo.templatemethod;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * CTO
 */
public class CTOWorker extends Worker {

    public CTOWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ", 开会 - 出API - 检查进度");
    }
}
