
package com.github.siemen.compound.impl;

import com.github.siemen.compound.Observable;
import com.github.siemen.compound.Observer;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：鸭叫实现-鸭鸣器</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class DuckCall implements Quackable {

    private Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("duck call..Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
       this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {

        this.observable.notifyObservers();
    }
}