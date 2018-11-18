package com.jinhui.designpatterndemo.factory.jdgc;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 简单工厂模式
 */
public class SimpleRoujiaMoFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo;
        switch (type) {
            case "Suan":
                roujiaMo = new ZSuanRoujiaMo();
                break;
            case "La":
                roujiaMo = new ZLaRoujiaMo();
                break;
            case "Tian":
                roujiaMo = new ZTianRoujiaMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new ZSuanRoujiaMo();
                break;
        }
        return roujiaMo;
    }
}
