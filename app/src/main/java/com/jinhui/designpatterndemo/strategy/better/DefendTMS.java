package com.jinhui.designpatterndemo.strategy.better;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class DefendTMS implements IDefendBehavior{
    @Override
    public void defend() {
        Log.e("---", "铁布衫");
    }
}
