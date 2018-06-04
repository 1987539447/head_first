/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.compound;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>描述：observable辅助类 实现观察处理</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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