package com.jinhui.designpatterndemo.factory.gcff;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 在北京和西安 开分店:
 * 工厂方法模式:
 * 定义：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。
 * 工厂方法模式把类实例化的过程推迟到子类。
 *
 * 对照定义：
 * 1、定义了创建对象的一个接口：public abstract RouJiaMo sellRoujiaMo(String type);
 * 2、由子类决定实例化的类，可以看到我们的馍是子类生成的。
 *
 */
public abstract class RoujiaMoStore {

    public abstract void sellRoujiaMo(String type);


}
