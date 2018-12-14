
package com.github.siemen.factory.abs.impl;

import com.github.siemen.factory.abs.Cheese;
import com.github.siemen.factory.abs.Dough;
import com.github.siemen.factory.abs.PizzaIngredientFactory;

/**
 * <b>描述：原料工厂实现</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("prepare thin crust dough");
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("prepare regiano cheese");
        return new RegianoCheese();
    }
}