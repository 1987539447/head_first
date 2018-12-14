
package com.github.siemen.decorator;

/**
 * <b>描述：具体咖啡</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class HouseBlend extends Beverage {


    public HouseBlend () {
        this.description = "HouseBlend";
    }
    public float cost() {
        return 3.0f;
    }
}
