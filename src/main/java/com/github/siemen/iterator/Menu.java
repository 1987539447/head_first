
package com.github.siemen.iterator;

/**
 * <b>描述：菜单接口</b> <br/>
 *
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public interface Menu {

    void addItem(String name, String des, boolean isVeg, double price);

    Iterator createIterator();
}