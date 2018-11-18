package com.jinhui.designpatterndemo.strategy.better;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class AttackXL implements IAttackBehavior {
    @Override
    public void attack() {
        Log.e("---", "降龙十八掌");
    }
}
