
package com.github.siemen.factory.abs;

/**
 * <b>描述：pizza抽象</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public abstract class Pizza {

    protected String name;
    protected Cheese cheese;
    protected Dough dough;

    protected abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cheese=" + cheese +
                ", dough=" + dough +
                '}';
    }
}