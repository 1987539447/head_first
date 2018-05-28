/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.iterator.impl;

import com.github.siemen.iterator.Iterator;
import com.github.siemen.iterator.MenuItem;

/**
 * <b>描述：午餐菜单迭代器实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class DinerMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length -1 || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }
}