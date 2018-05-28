/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.iterator.impl;

import com.github.siemen.iterator.Iterator;
import com.github.siemen.iterator.MenuItem;
import java.util.List;

/**
 * <b>描述：早餐迭代实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class PancakeHouseMenuIterator implements Iterator {

    private List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position > menuItems.size() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}