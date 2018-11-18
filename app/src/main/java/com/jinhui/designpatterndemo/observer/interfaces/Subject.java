package com.jinhui.designpatterndemo.observer.interfaces;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 专题接口,所有的主题必须实现此接口
 */
public interface Subject {

    /**
     * 注册一个观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     */
    public void removeObserver(Observer observer);
    /**
     * 通知所有观察者
     */
    public void notifyObserver();
}
