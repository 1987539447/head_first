/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.factory.simple;

/**
 * <b>描述：简单工厂实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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