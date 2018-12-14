
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.QuackBehavior;

/**
 * <b>描述：叫声行为实现-橡皮鸭</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class SQuack implements QuackBehavior {
    public void quack() {
        System.out.println("....toy duck : zhi. zhi. zhi....");
    }
}