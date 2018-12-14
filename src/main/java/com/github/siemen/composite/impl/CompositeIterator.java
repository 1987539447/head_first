
package com.github.siemen.composite.impl;

import com.github.siemen.composite.MenuComponent;
import java.util.Iterator;
import java.util.Stack;

/**
 * <b>描述：</b> <br/>
 *
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class CompositeIterator implements Iterator {

    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator iter = stack.peek();
        if (iter.hasNext()) {
            return true;
        } else {
            stack.pop();
            return hasNext();
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponent> iter = stack.peek();
            MenuComponent menuComponent = iter.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        } else {
            return null;
        }
    }
}