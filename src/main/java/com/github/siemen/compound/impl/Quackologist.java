
package com.github.siemen.compound.impl;

import com.github.siemen.compound.Observer;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：观察者实现 - 叫声日志</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class Quackologist implements Observer {
    @Override
    public void update(Quackable duck) {
        System.out.println("Quackologist .." + duck + " just quacked");
    }
}