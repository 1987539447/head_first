/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.iterator;

import java.util.List;

/**
 * <b>描述：女招待类</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class Waitress {

    private List<Menu> menuList;

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        for (Menu menu : menuList) {
            Iterator iter = menu.createIterator();
            printMenu(iter);
        }
    }

    private void printMenu(Iterator iter) {
        while (iter.hasNext()) {
            MenuItem item = (MenuItem) iter.next();
            System.out.println(item.getName() + ", ");
            System.out.println(item.getPrice() + "---");
            System.out.println(item.getDescription());
        }
    }
}