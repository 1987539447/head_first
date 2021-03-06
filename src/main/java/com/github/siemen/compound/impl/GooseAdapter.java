
package com.github.siemen.compound.impl;

import com.github.siemen.compound.Goose;
import com.github.siemen.compound.Observable;
import com.github.siemen.compound.Observer;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：鹅适配器</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class GooseAdapter implements Quackable {


    private Observable observable;
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
       this.goose.honk();
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