package com.jinhui.designpatterndemo.factory.gcff;

import com.jinhui.designpatterndemo.factory.jdgc.RoujiaMo;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 西安 简单工厂模式:
 * 用来西安店生产自己店里的肉夹馍
 */
public class XianSimpleRoujiaMoFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new XianSuanRoujiMo();
                break;
            case "La":
                roujiaMo = new XianKuRoujiMo();
                break;
            case "Tian":
                roujiaMo = new XianlaRoujiMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new XianSuanRoujiMo();
                break;
        }
        return roujiaMo;
    }
}