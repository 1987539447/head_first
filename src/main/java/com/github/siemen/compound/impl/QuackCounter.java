/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.compound.impl;

import com.github.siemen.compound.Observable;
import com.github.siemen.compound.Observer;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：装饰器 -- 叫声计数</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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