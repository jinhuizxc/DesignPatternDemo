package com.jinhui.designpatterndemo.factory.cxgc;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 西安的肉夹馍原料工厂,是西安的特色原料,还有其他分店的特色原料
 */
class XianRoujiaMoYLFoctory implements RoujiaMoYLFactory{


    @Override
    public Meet creatMeet() {
        return new XianFreshMeet();
    }

    @Override
    public YuanLiao creatYuanLiao() {
        return new XianTeSeYuanLiao();
    }
}
