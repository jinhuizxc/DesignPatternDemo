package com.jinhui.designpatterndemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jinhui.designpatterndemo.R;
import com.jinhui.designpatterndemo.adapter.AdapterActivity;
import com.jinhui.designpatterndemo.command.CommandActivity;
import com.jinhui.designpatterndemo.factory.FactoryActivity;
import com.jinhui.designpatterndemo.observer.ObserverActivity;
import com.jinhui.designpatterndemo.singleton.SingletonActivity;
import com.jinhui.designpatterndemo.state.StateActivity;
import com.jinhui.designpatterndemo.strategy.StrategyActivity;
import com.jinhui.designpatterndemo.templatemethod.TemplateMethodActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jh on 2018/8/26.
 * Email: 1004260403@qq.com
 * <p>
 * 设计模式
 * https://github.com/youlookwhat/DesignPattern
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_observer)
    Button btObserver;
    @BindView(R.id.bt_factory)
    Button btFactory;
    @BindView(R.id.bt_singleton)
    Button btSingleton;
    @BindView(R.id.bt_strategy)
    Button btStrategy;
    @BindView(R.id.bt_adapter)
    Button btAdapter;
    @BindView(R.id.bt_command)
    Button btCommand;
    @BindView(R.id.bt_decorator)
    Button btDecorator;
    @BindView(R.id.bt_facade)
    Button btFacade;
    @BindView(R.id.bt_template_method)
    Button btTemplateMethod;
    @BindView(R.id.bt_state)
    Button btState;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.bt_observer, R.id.bt_factory, R.id.bt_singleton, R.id.bt_strategy, R.id.bt_adapter, R.id.bt_command, R.id.bt_decorator, R.id.bt_facade, R.id.bt_template_method, R.id.bt_state})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_observer:  // 观察者模式
                startActivity(new Intent(this, ObserverActivity.class));
                break;
            case R.id.bt_factory:  // 工厂模式
                startActivity(new Intent(this, FactoryActivity.class));
                break;
            case R.id.bt_singleton: //  单例设计模式
                startActivity(new Intent(this, SingletonActivity.class));
                break;
            case R.id.bt_strategy: // 策略模式
                startActivity(new Intent(this, StrategyActivity.class));
                break;
            case R.id.bt_adapter: // 适配器模式
                startActivity(new Intent(this, AdapterActivity.class));
                break;
            case R.id.bt_command: // 命令模式
                startActivity(new Intent(this, CommandActivity.class));
                break;
            case R.id.bt_decorator: // 装饰者模式
                break;
            case R.id.bt_facade: // 外观模式
                break;
            case R.id.bt_template_method: // 模板方法模式
                startActivity(new Intent(this, TemplateMethodActivity.class));
                break;
            case R.id.bt_state:// 状态模式
                startActivity(new Intent(this, StateActivity.class));
                break;
        }
    }
}
