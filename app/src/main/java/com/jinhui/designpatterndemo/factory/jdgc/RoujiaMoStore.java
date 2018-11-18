package com.jinhui.designpatterndemo.factory.jdgc;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 简单工厂模式
 */
public class RoujiaMoStore {


    /**
     * 根据传入不同的类型卖不同的肉夹馍
     */
    /*public RoujiaMo sellRoujiaMo(String type) {

        RoujiaMo roujiaMo = null;
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
                roujiaMo = new SuanRoujiaMo();
                break;
        }
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;

    }*/

    private SimpleRoujiaMoFactory factory;

    public RoujiaMoStore(SimpleRoujiaMoFactory factory) {
        this.factory = factory;
    }

    public void sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
    }


}
