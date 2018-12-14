
package com.github.siemen.compound.impl;

import com.github.siemen.compound.Observable;
import com.github.siemen.compound.Observer;
import com.github.siemen.compound.Quackable;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>描述：组合模式 - 一群鸭子</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class Flock implements Quackable {

    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        this.quackers.add(quacker);
    }
    @Override
    public void quack() {
        notifyObservers();
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}