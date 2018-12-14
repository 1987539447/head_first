
package com.github.siemen.composite.impl;

import java.util.Iterator;

/**
 * <b>描述：</b> <br/>
 *
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}