
package com.github.siemen.factory.simple;

/**
 * <b>描述：简单工厂实现</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
        case "cheese":
            return new CheesePizza();
        case "calm":
            return new ClamPizza();
            default:
                throw new IllegalArgumentException("...not supported...");
        }
    }
}