
package com.github.siemen.compound;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>描述：observable辅助类 实现观察处理</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class Observable implements QuackObervable {

    private List<Observer> observers = new ArrayList<>();
    private Quackable duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }

    }
}