package com.jinhui.designpatterndemo.templatemethod;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 测试人员
 */
public class QAWorker extends Worker {

    public QAWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ", 写测试用例 - 提交Bug - 复查Bug");
    }
}
