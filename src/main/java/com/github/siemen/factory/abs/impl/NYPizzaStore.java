/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.factory.abs.impl;

import com.github.siemen.factory.abs.Pizza;
import com.github.siemen.factory.abs.PizzaIngredientFactory;
import com.github.siemen.factory.abs.PizzaStore;

/**
 * <b>描述：pizza store 实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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