/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.strategy;

import com.github.siemen.strategy.impl.FlyWithWings;
import com.github.siemen.strategy.impl.MallardDuck;
import com.github.siemen.strategy.impl.RubberDuck;

/**
 * <b>描述：模拟测试鸭子</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class MiniDuckSimulate {
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly();
    }
}