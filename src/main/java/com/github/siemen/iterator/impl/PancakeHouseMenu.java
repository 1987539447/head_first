/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.iterator.impl;

import com.github.siemen.iterator.Iterator;
import com.github.siemen.iterator.Menu;
import com.github.siemen.iterator.MenuItem;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>描述：早餐菜单实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class PancakeHouseMenu implements Menu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast",
                "Pancake with egg and toast",
                true, 2.99);
        addItem("Regular Breakfast",
                "Pancake with egg and sausage",
                false, 2.99);
        addItem("Blueberry pancakes",
                "pancake with blueberry",
                true, 3.59);
    }

    @Override
    public void addItem(String name, String des, boolean isVeg, double price) {
        this.menuItems.add(new MenuItem(name, des, isVeg, price));
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}