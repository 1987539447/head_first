
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.Duck;

/**
 * <b>描述：具体鸭子实现-橡皮鸭</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new SQuack();
    }

    public void display() {
        System.out.println("... i am rubber duck...");
    }
}