
package com.github.siemen.composite.impl;

import com.github.siemen.composite.MenuComponent;
import java.util.Iterator;

/**
 * <b>描述：菜单组件实现-菜单项</b> <br/>
 *
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class MenuItem extends MenuComponent{

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println(" ---" + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}