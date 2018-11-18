package com.jinhui.designpatterndemo.decorator;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 红宝石装饰品
 * 每颗攻击力: +15
 * 这与武器等不同,它是可以累加的,而武器不能
 */
public class RedGemDecotator implements IEuipDecotator {

    private IEquip iEquip;

    public RedGemDecotator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int caculateAttack() {
        return 15 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + "+ 红宝石";
    }
}
