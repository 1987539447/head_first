
package com.github.siemen.factory.abs.impl;

import com.github.siemen.factory.abs.Dough;
import com.github.siemen.factory.abs.Pizza;
import com.github.siemen.factory.abs.PizzaIngredientFactory;

/**
 * <b>描述：pizza实现</b> <br/>
 *
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public class DoughPizza extends Pizza {

    private PizzaIngredientFactory factory;
    public DoughPizza(PizzaIngredientFactory factory) {
       this.factory = factory;
    }
    @Override
    protected void prepare() {

        System.out.println("Preparing :" + name);
        Dough dough = factory.createDough();
    }
}