package com.jinhui.designpatterndemo.factory.cxgc;

import android.support.annotation.NonNull;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
class XianTeSeYuanLiao extends YuanLiao {

    public String yuanliao = "西安特色原料";

    @NonNull
    @Override
    public String toString() {
        return yuanliao;
    }
}
