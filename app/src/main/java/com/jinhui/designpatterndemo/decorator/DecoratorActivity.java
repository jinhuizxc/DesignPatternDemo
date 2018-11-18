package com.jinhui.designpatterndemo.decorator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jinhui.designpatterndemo.EMTagHandler;
import com.jinhui.designpatterndemo.R;
import com.jinhui.designpatterndemo.app.AppConstant;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 * <p>
 * 装饰者模式:
 * 装饰者模式：若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。
 * 先简单描述下装饰者模式发挥作用的地方，当我们设计好了一个类，我们需要给这个类添加一些辅助的功能，
 * 并且不希望改变这个类的代码，这时候就是装饰者模式大展雄威的时候了。
 * 这里还体现了一个原则：类应该对扩展开放，对修改关闭。
 * eg:
 * 1、武器（攻击力20） 、戒指（攻击力5）、护腕（攻击力5）、鞋子（攻击力5）
 * 2、蓝宝石（攻击力5/颗）、黄宝石（攻击力10/颗）、红宝石（攻击力15/颗）
 * 3、每个装备可以随意镶嵌3颗
 */
public class DecoratorActivity extends AppCompatActivity {

    @BindView(R.id.bt_decorator)
    Button btDecorator;
    @BindView(R.id.bt_demo1)
    Button btDemo1;
    @BindView(R.id.bt_demo2)
    Button btDemo2;
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_decorator)
    LinearLayout activityDecorator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        ButterKnife.bind(this);

        setTitle("装饰者模式");

        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.DECORATOR_DEFINE));

    }

    @OnClick({R.id.bt_demo1, R.id.bt_demo2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_demo1:
                Log.e("---", "一个镶嵌2颗红宝石,1颗蓝宝石的靴子: ");
                IEquip iEquip = new RedGemDecotator(new RedGemDecotator(new BlueGemDecotator(new ShoeEquip())));
                Log.e("---", "攻击力:" + iEquip.caculateAttack());  // E/---: 攻击力:40
                Log.e("---", "描述语:" + iEquip.description());    // E/---: 描述语:圣战靴子+ 蓝宝石+ 红宝石+ 红宝石
                break;
            case R.id.bt_demo2:
                Log.e("---", "一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指: ");
                RedGemDecotator redGemDecotator = new RedGemDecotator(new BlueGemDecotator(new YellowGemDecotator(new RingEquip())));
                Log.e("---", "攻击力:" + redGemDecotator.caculateAttack());  // E/---: 攻击力:35
                Log.e("---", "描述语:" + redGemDecotator.description());     // E/---: 描述语:圣战戒指+ 黄宝石+ 蓝宝石+ 红宝石
                break;
        }
    }
}
