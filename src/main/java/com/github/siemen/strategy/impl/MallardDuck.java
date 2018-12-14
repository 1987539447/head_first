
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.Duck;

/**
 * <b>描述：具体鸭子实现-绿头鸭</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("... i am a mallard duck...");
    }
}