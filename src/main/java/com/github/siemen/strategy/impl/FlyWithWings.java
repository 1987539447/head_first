
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.FlyBehavior;

/**
 * <b>描述：飞行实现-用翅膀</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("...Fly with wings....");
    }
}