
package com.github.siemen.factory.abs;

/**
 * <b>描述：pizza store 抽象</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}