
package com.github.siemen.adapter.impl;

import com.github.siemen.adapter.Turkey;

/**
 * <b>描述：火鸡实现</b> <br/>
 *
 * <b>时间：</b>2018-05-23<br/>
 *
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble...Gobble...");
    }

    public void fly() {

        System.out.println("I'm flying a short distance");

    }
}