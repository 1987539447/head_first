
package com.github.siemen.factory.simple;

/**
 * <b>描述：客户类 使用工厂创建pizza</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizz(String type) {
        Pizza pizza = this.factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}