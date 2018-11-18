package com.jinhui.designpatterndemo.factory.cxgc;



/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */
public class XianRoujiaMoTeSeStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoTeSeFactory factory;

    public XianRoujiaMoTeSeStore(XianSimpleRoujiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    @Override
    public RoujiaMo sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare(new XianRoujiaMoYLFoctory());
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
