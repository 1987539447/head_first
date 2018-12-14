
package com.github.siemen.decorator;

/**
 * <b>描述：装饰者 具体调料</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return this.beverage.getDescription() +  ", milk";
    }

    public float cost() {
        return this.beverage.cost() + 1.2f;
    }
}