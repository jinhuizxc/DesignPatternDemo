package com.jinhui.designpatterndemo.templatemethod;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jinhui.designpatterndemo.EMTagHandler;
import com.jinhui.designpatterndemo.R;
import com.jinhui.designpatterndemo.app.AppConstant;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/15.
 * <p>
 * 模版方法模式 展现程序员的一天
 * 定义：定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 * 以公司人员一天上班为例:
 * 简单描述一下：本公司有程序猿、测试、HR、项目经理等人，下面使用模版方法模式，记录下所有人员的上班情况：
 * 模版方式里面也可以可选的设置钩子，比如现在希望记录程序员离开公司的时间，我们就可以在超类中添加一个钩子：
 */
public class TemplateMethodActivity extends AppCompatActivity {

    @BindView(R.id.bt_template_method)
    Button btTemplateMethod;
    @BindView(R.id.bt_template_method_text)
    Button btTemplateMethodText;
    @BindView(R.id.bt_template_method_text2)
    Button btTemplateMethodText2;
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_template_method)
    LinearLayout activityTemplateMethod;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method);
        ButterKnife.bind(this);

        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.TEMPLATEMETHOD_DEFINE));
    }

    @OnClick({R.id.bt_template_method, R.id.bt_template_method_text, R.id.bt_template_method_text2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_template_method:
                break;
            case R.id.bt_template_method_text: // 查看所有人员的工作情况
                break;
            case R.id.bt_template_method_text2: // 查看程序猿离开公司的时间
                break;
        }
    }
}
