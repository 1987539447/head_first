
package com.github.siemen.compound;

/**
 * <b>描述：抽象工厂 - 鸭子工厂</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}