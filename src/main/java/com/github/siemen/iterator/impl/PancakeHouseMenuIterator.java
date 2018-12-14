
package com.github.siemen.iterator.impl;

import com.github.siemen.iterator.Iterator;
import com.github.siemen.iterator.MenuItem;
import java.util.List;

/**
 * <b>描述：早餐迭代实现</b> <br/>
 *
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