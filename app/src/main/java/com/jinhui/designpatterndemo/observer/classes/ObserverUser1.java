package com.jinhui.designpatterndemo.observer.classes;

import android.util.Log;
import android.widget.Toast;

import com.jinhui.designpatterndemo.app.PatternApplication;
import com.jinhui.designpatterndemo.observer.interfaces.Observer;
import com.jinhui.designpatterndemo.observer.interfaces.Subject;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 模拟第一个使用者
 */
public class ObserverUser1 implements Observer {

    public ObserverUser1(Subject subject) {
        subject.registerObserver(this); // 注册观察者
    }

    @Override
    public void update(String msg) {
        Log.e("-----ObserverUser1 ", "得到 3D 号码:" + msg + ", 我要记下来。 ");
//        Toast.makeText(PatternApplication.getInstance(), "-----ObserverUser1 得到 3D 号码:" + msg, Toast.LENGTH_SHORT).show();
    }
}
