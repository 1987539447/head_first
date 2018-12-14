
package com.github.siemen.compound.impl;

import com.github.siemen.compound.Observable;
import com.github.siemen.compound.Observer;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：装饰器 -- 叫声计数</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        this.duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.duck.notifyObservers();
    }
}