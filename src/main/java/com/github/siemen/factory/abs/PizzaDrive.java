
package com.github.siemen.factory.abs;

import com.github.siemen.factory.abs.impl.NYPizzaStore;

/**
 * <b>描述：测试pizza</b> <br/>
 *
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