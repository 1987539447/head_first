/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.composite;

import com.github.siemen.composite.impl.Menu;
import com.github.siemen.composite.impl.MenuItem;

/**
 * <b>描述：测试</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        MenuComponent allMenu = new Menu("ALL MENUS", "All menus combined");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(cafeMenu);

        //menu items
        dinnerMenu.add(new MenuItem("Pasta", "Spagheti....",
                true, 3.28));
        dinnerMenu.add(new MenuItem("Pork", "pork..xx.", false, 5.6));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie withi flakey crust...",
                true, 1.59));

        pancakeHouseMenu.add(new MenuItem("Pancake", "simple pancake",
                true, 1.2));

        cafeMenu.add(new MenuItem("Coffee", "black coffee", true, 2.2));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
        waitress.printVegtarianMenu();

    }
}