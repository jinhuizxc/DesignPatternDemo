package com.jinhui.designpatterndemo.observer.classes;

import android.util.Log;
import android.widget.Toast;

import com.jinhui.designpatterndemo.app.PatternApplication;
import com.jinhui.designpatterndemo.observer.interfaces.Observer;
import com.jinhui.designpatterndemo.observer.interfaces.Subject;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class ObserverUser2 implements Observer {

    public ObserverUser2(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.e("-----ObserverUser2 ", "得到 3D 号码:" + msg + ", 我要告诉舍友们。");
//        Toast.makeText(PatternApplication.getInstance(), "-----ObserverUser2 得到 3D 号码:" + msg, Toast.LENGTH_SHORT).show();
    }
}
