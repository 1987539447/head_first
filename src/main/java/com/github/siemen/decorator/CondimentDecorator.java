
package com.github.siemen.decorator;

/**
 * <b>描述：调料接口</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;
    public abstract String getDescription();
}