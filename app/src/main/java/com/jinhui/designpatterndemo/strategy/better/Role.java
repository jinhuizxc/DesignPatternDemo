package com.jinhui.designpatterndemo.strategy.better;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 新改进的角色超类:
 * 遵循设计的原则，找出应用中可能需要变化的部分，把它们独立出来，
 * 不要和那些不需要变化的代码混在一起。
 * 我们发现，对于每个角色的display，attack，defend，run都是有可能变化的，于是我们必须把这写独立出来。
 * 再根据另一个设计原则：针对接口（超类型）编程，而不是针对实现编程，于是我们把代码改造成这样：
 */
public abstract class Role {

    protected String name;


    public Role setiDisplayBehavior(DisplayYZ displayYZ) {
        return this;
    }

    public Role setiAttackBehavior(AttackXL attackXL) {
        return this;
    }

    public Role setiDefendBehavior(DefendTMS defendTMS) {
        return this;
    }

    public Role setiRunBehavior(RunJCTQ runJCTQ) {
        return this;
    }

    public void display() {

    }

    public void attack() {

    }

    public void run() {

    }

    public void defend() {

    }
}
