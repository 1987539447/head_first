/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.iterator.impl;

import com.github.siemen.iterator.Iterator;
import com.github.siemen.iterator.Menu;
import com.github.siemen.iterator.MenuItem;

/**
 * <b>描述：午餐菜单实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class DinnerMenu implements Menu{

    private static int MAX_ITEMS = 6;
    private int numberOfItmes = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "xxx...xx .. tomato ", true, 2.99);
        addItem("BLT", "Bacon....xx.", false, 2.99);
        addItem("Soup of the Day", "souap .. potato ..salad", false, 3.29);
    }

    @Override
    public void addItem(String name, String des, boolean isVeg, double price) {
        if (numberOfItmes >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!! can not add item");
            return;
        }
        menuItems[numberOfItmes++] = new MenuItem(name, des, isVeg, price);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}