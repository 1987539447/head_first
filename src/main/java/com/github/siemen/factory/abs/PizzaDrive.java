/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.factory.abs;

import com.github.siemen.factory.abs.impl.NYPizzaStore;

/**
 * <b>描述：测试pizza</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public class PizzaDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("dough");
    }
}