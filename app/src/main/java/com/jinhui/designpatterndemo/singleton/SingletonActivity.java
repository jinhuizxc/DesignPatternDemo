package com.jinhui.designpatterndemo.singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jinhui.designpatterndemo.R;
import com.jinhui.designpatterndemo.singleton.ehan.SingletonEHan;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jh on 2018/8/26.
 * Email: 1004260403@qq.com
 */
public class SingletonActivity extends AppCompatActivity {

    @BindView(R.id.bt_ehan)
    Button btEhan;
    @BindView(R.id.bt_lanhan)
    Button btLanhan;
    @BindView(R.id.bt_inclass)
    Button btInclass;
    @BindView(R.id.bt_enum)
    Button btEnum;
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_singleton)
    LinearLayout activitySingleton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_ehan, R.id.bt_lanhan, R.id.bt_inclass, R.id.bt_enum})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_ehan:
                // 饿汉式[可用]
//                SingletonEHan singletonEHan = SingletonEHan.getInstance();
                SingletonEHan singletonEHan = SingletonEHan.getSingletonEHan();
                break;
            case R.id.bt_lanhan:
                // 懒汉式[双重校验锁 推荐用]

                break;
            case R.id.bt_inclass:
                //内部类[推荐用]
                break;
            case R.id.bt_enum:
                // 枚举[推荐用]
                break;

        }
    }
}
