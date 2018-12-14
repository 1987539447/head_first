
package com.github.siemen.decorator;

/**
 * <b>描述：咖啡测试</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}