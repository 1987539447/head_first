
package com.github.siemen.compound.impl;

import com.github.siemen.compound.AbstractDuckFactory;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：使用装饰器的工厂模式 - 计数鸭子工厂</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}