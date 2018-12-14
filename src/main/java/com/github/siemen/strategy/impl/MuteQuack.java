
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.QuackBehavior;

/**
 * <b>描述：叫声行为实现-不会叫</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("... can not quack...");
    }
}