package com.jinhui.designpatterndemo.decorator;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 黄宝石装饰品
 * 每颗攻击力: +10
 * 这与武器等不同,它是可以累加的,而武器不能
 */
public class YellowGemDecotator implements IEuipDecotator {

    private IEquip iEquip;

    public YellowGemDecotator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int caculateAttack() {
        return 10 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + "+ 黄宝石";
    }

}
