/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.factory.abs.impl;

import com.github.siemen.factory.abs.Cheese;
import com.github.siemen.factory.abs.Dough;
import com.github.siemen.factory.abs.PizzaIngredientFactory;

/**
 * <b>描述：原料工厂实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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