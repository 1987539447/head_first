
package com.github.siemen.adapter;

/**
 * <b>描述：适配器-火鸡适配为鸭子</b> <br/>
 *
 * <b>时间：</b>2018-05-23<br/>
 *
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        this.turkey.gobble();
    }

    public void fly() {

        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }

    }
}