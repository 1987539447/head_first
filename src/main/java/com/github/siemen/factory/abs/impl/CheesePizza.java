
package com.github.siemen.factory.abs.impl;

import com.github.siemen.factory.abs.Pizza;
import com.github.siemen.factory.abs.PizzaIngredientFactory;

/**
 * <b>描述：pizza实现</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + name);
        cheese = ingredientFactory.createCheese();
    }


}