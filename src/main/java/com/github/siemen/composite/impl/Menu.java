
package com.github.siemen.composite.impl;

import com.github.siemen.composite.MenuComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <b>描述：菜单组件实现-菜单</b> <br/>
 *
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class Menu extends MenuComponent {

    private String name;
    private String description;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int idx) {
        return this.menuComponents.get(idx);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println(" ------------------------- ");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(this.menuComponents.iterator());
    }
}