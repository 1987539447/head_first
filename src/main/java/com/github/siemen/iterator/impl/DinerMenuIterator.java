
package com.github.siemen.iterator.impl;

import com.github.siemen.iterator.Iterator;
import com.github.siemen.iterator.MenuItem;

/**
 * <b>描述：午餐菜单迭代器实现</b> <br/>
 *
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