
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.FlyBehavior;

/**
 * <b>描述：飞行行为实现-不会飞</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("....can not fly....");
    }
}