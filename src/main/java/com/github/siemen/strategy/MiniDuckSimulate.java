
package com.github.siemen.strategy;

import com.github.siemen.strategy.impl.FlyWithWings;
import com.github.siemen.strategy.impl.MallardDuck;
import com.github.siemen.strategy.impl.RubberDuck;

/**
 * <b>描述：模拟测试鸭子</b> <br/>
 *
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