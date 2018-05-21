/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.factory.abs.impl;

import com.github.siemen.factory.abs.Dough;
import com.github.siemen.factory.abs.Pizza;
import com.github.siemen.factory.abs.PizzaIngredientFactory;

/**
 * <b>描述：pizza实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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