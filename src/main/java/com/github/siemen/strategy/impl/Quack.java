
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.QuackBehavior;

/**
 * <b>描述：叫声行为实现-鸭子叫</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("...... real duck : ga .ga .ga....");
    }
}