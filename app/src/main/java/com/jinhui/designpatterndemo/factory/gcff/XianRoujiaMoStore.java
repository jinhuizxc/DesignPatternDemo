package com.jinhui.designpatterndemo.factory.gcff;

import com.jinhui.designpatterndemo.factory.jdgc.RoujiaMo;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */
public class XianRoujiaMoStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoFactory factory;


    public XianRoujiaMoStore(XianSimpleRoujiaMoFactory factory) {
        this.factory = factory;
    }

    @Override
    public void sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
    }


    //    @Override
//    public RoujiaMo creatRoujiaMo(String type) {
//
//        RoujiaMo roujiaMo = null;
//        switch (type) {
//            case "suan":
//                roujiaMo = new XianSuanRoujiMo();
//                break;
//            case "tian":
//                roujiaMo = new XianKuRoujiMo();
//                break;
//            case "la":
//                roujiaMo = new XianlaRoujiMo();
//                break;
//            default:// 默认为 西安 酸肉夹馍
//                roujiaMo = new XianSuanRoujiMo();
//                break;
//        }
//        return roujiaMo;
//    }
}
