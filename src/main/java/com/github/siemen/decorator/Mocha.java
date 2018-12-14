
package com.github.siemen.decorator;

/**
 * <b>描述：装饰者实现</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public float cost() {
        return this.beverage.cost() + 2.1f;
    }
}