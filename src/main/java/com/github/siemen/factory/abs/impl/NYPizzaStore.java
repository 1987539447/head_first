
package com.github.siemen.factory.abs.impl;

import com.github.siemen.factory.abs.Pizza;
import com.github.siemen.factory.abs.PizzaIngredientFactory;
import com.github.siemen.factory.abs.PizzaStore;

/**
 * <b>描述：pizza store 实现</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        Pizza pizza;
        switch (type) {
        case "cheese":
            pizza = new CheesePizza(factory);
            pizza.setName("NewYork CheesePizza");
            break;
        case "dough":
            pizza = new DoughPizza(factory);
            pizza.setName("NewYork DoughPizza");
            break;
        default:
            throw new IllegalArgumentException("not supported");
        }
        return pizza;
    }
}