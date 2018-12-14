
package com.github.siemen.compound.impl;

import com.github.siemen.compound.AbstractDuckFactory;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：工厂实现 - 没装饰器的工厂</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}