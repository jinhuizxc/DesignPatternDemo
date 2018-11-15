package com.jinhui.designpatterndemo.state;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jinhui.designpatterndemo.EMTagHandler;
import com.jinhui.designpatterndemo.R;
import com.jinhui.designpatterndemo.app.AppConstant;
import com.jinhui.designpatterndemo.state.better.VendingMachineBetter;
import com.jinhui.designpatterndemo.state.old.VendingMachine;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/15.
 */
public class StateActivity extends AppCompatActivity {

    @BindView(R.id.bt_facade)
    Button btFacade;
    @BindView(R.id.bt_facade_old)
    Button btFacadeOld;
    @BindView(R.id.bt_facade_better)
    Button btFacadeBetter;
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_state)
    LinearLayout activityState;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        ButterKnife.bind(this);

        setTitle("状态模式");

        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.STATE_DEFINE));

    }

    @OnClick({R.id.bt_facade_old, R.id.bt_facade_better})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_facade_old: // 最初实现待改进
                // 初始化售货机,且里面有3个商品
                VendingMachine vendingMachine = new VendingMachine(3);
                vendingMachine.insertMoney();
                vendingMachine.turnCrank();
                Log.e("测试:", "----------------------");
                vendingMachine.insertMoney();
                vendingMachine.turnCrank();
                Log.e("压力测试:", "----------------------");
                vendingMachine.insertMoney();
                vendingMachine.insertMoney();
                vendingMachine.turnCrank();
                vendingMachine.turnCrank();
                vendingMachine.backMoney();
                vendingMachine.turnCrank();
                break;
            case R.id.bt_facade_better: // 改进过的售货机
                VendingMachineBetter machineBetter = new VendingMachineBetter(4);
//                machineBetter.dispense();无法直接操作 出商品(出商品是自动的);
                // 正常: 投币  退币  摇杆

                Log.e("测试:", "----------------------");
                machineBetter.insertMoney();
                machineBetter.turnCrank();
                machineBetter.insertMoney();
                machineBetter.turnCrank();
                machineBetter.insertMoney();
                machineBetter.turnCrank();
                machineBetter.insertMoney();
                machineBetter.turnCrank();

                Log.e("压力测试:", "----------------------");
                machineBetter.insertMoney();
                machineBetter.insertMoney();
                machineBetter.insertMoney();
                machineBetter.backMoney();
                machineBetter.backMoney();
                machineBetter.backMoney();
                machineBetter.turnCrank();
                machineBetter.turnCrank();
                machineBetter.turnCrank();
                break;
        }
    }
}
