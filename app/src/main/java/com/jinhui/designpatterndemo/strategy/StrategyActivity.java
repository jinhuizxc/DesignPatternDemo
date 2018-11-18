package com.jinhui.designpatterndemo.strategy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jinhui.designpatterndemo.EMTagHandler;
import com.jinhui.designpatterndemo.R;
import com.jinhui.designpatterndemo.app.AppConstant;
import com.jinhui.designpatterndemo.strategy.better.AttackXL;
import com.jinhui.designpatterndemo.strategy.better.DefendTMS;
import com.jinhui.designpatterndemo.strategy.better.DisplayYZ;
import com.jinhui.designpatterndemo.strategy.better.RoleA;
import com.jinhui.designpatterndemo.strategy.better.RunJCTQ;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 * <p>
 * 策略模式（Strategy Pattern）：定义了算法族，分别封装起来，
 * 让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
 */
public class StrategyActivity extends AppCompatActivity {

    @BindView(R.id.bt_strategy)
    Button btStrategy;
    @BindView(R.id.bt_strategy_text)
    Button btStrategyText;
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_stategy)
    LinearLayout activityStategy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        ButterKnife.bind(this);
        setTitle("策略模式");
        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.STRATEGY_DEFINE));
    }

    @OnClick(R.id.bt_strategy_text)
    public void onViewClicked() {
        RoleA roleA = new RoleA("---A");
        roleA.setiDisplayBehavior(new DisplayYZ())
                .setiAttackBehavior(new AttackXL())
                .setiDefendBehavior(new DefendTMS())
                .setiRunBehavior(new RunJCTQ());
        roleA.display();// 样子
        roleA.attack();// 攻击
        roleA.run();// 逃跑
        roleA.defend();// 防御
    }
}
