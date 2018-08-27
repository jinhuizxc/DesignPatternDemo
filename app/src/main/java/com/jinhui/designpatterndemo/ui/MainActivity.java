package com.jinhui.designpatterndemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jinhui.designpatterndemo.R;
import com.jinhui.designpatterndemo.singleton.SingletonActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jh on 2018/8/26.
 * Email: 1004260403@qq.com
 * <p>
 * 设计模式
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
            case R.id.bt_observer:
                break;
            case R.id.bt_factory:
                break;
            case R.id.bt_singleton:
                //  单例设计模式
                startActivity(new Intent(this, SingletonActivity.class));
                break;
            case R.id.bt_strategy:
                break;
            case R.id.bt_adapter:
                break;
            case R.id.bt_command:
                break;
            case R.id.bt_decorator:
                break;
            case R.id.bt_facade:
                break;
            case R.id.bt_template_method:
                break;
            case R.id.bt_state:
                break;
        }
    }
}
