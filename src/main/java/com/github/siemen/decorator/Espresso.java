
package com.github.siemen.decorator;

/**
 * <b>描述：Espresso咖啡</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class Espresso extends Beverage {


    public Espresso() {
        this.description = "Espresso";
    }
    public float cost() {
        return 5.2f;
    }
}