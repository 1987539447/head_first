
package com.github.siemen.decorator;

/**
 * <b>描述：咖啡抽象类</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public abstract class Beverage {

    protected  String description = "Unknown beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract float cost();
}