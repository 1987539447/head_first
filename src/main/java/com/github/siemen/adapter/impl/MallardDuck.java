
package com.github.siemen.adapter.impl;

import com.github.siemen.adapter.Duck;

/**
 * <b>描述：鸭子实现</b> <br/>
 *
 * <b>时间：</b>2018-05-23<br/>
 *
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack......");
    }

    public void fly() {

        System.out.println("I'm flying.....");

    }
}