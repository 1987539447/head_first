
package com.github.siemen.factory.abs;

/**
 * <b>描述：原料工厂接口</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Cheese createCheese();
}