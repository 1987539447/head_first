
package com.github.siemen.composite;

import java.util.Iterator;

/**
 * <b>描述：女招待类</b> <br/>
 *
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class Waitress {

    private MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenu() {
        this.allMenu.print();
    }

    public void printVegtarianMenu() {
        Iterator iterator = allMenu.createIterator();
        System.out.println("\n VEGETARIAN MENU");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ex) {}
        }
    }
}