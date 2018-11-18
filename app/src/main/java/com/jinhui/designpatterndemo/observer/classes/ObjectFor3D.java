package com.jinhui.designpatterndemo.observer.classes;


import com.jinhui.designpatterndemo.observer.interfaces.Observer;
import com.jinhui.designpatterndemo.observer.interfaces.Subject;

import java.util.ArrayList;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 接下来3D服务号的实现类
 */
public class ObjectFor3D implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 3D 彩票的号码
     */
    private String msg;

    /**
     * 主题更新信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(msg);
        }
    }
}
