package com.jinhui.designpatterndemo.state.better;

import android.util.Log;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/15.
 *
 * 中奖状态 :10%  1--10个随机数里面取一个
 * 中奖的状态，该状态下不会有任何用户的操作
 */
public class WinnerState implements State {

    private VendingMachineBetter machineBetter;

    public WinnerState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        throw new IllegalStateException("非法操作!");
    }

    @Override
    public void backMoney() {
        throw new IllegalStateException("非法操作!");
    }

    @Override
    public void turnCrank() {
        throw new IllegalStateException("非法操作!");
    }

    @Override
    public void dispense() {
        Log.e("WinnerState", "---您中奖了, 恭喜您,将获得2件商品!");
        machineBetter.dispense();
        if (machineBetter.getCount() == 0) {
            Log.e("WinnerState", "---商品已售罄,中奖失效...");
            machineBetter.setState(machineBetter.getSoldOutState());
        } else {
            machineBetter.dispense();
            if (machineBetter.getCount() > 0) {
                machineBetter.setState(machineBetter.getNoMoneyState());
            } else {
                machineBetter.setState(machineBetter.getSoldOutState());
            }
        }
    }

}
