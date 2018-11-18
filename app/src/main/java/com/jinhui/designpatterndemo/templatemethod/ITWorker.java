package com.jinhui.designpatterndemo.templatemethod;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 程序员
 */
public class ITWorker extends Worker {

    public ITWorker(String name) {
        super(name);
    }

    /**
     * 重写父类的此方法,使可以查看离开公司时间
     */
    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ", 写程序 - 测bug - 修复bug");
    }
}
