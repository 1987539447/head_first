
package com.github.siemen.adapter;

import com.github.siemen.adapter.impl.MallardDuck;
import com.github.siemen.adapter.impl.WildTurkey;

/**
 * <b>描述：测试类</b> <br/>
 *
 * <b>时间：</b>2018-05-23<br/>
 *
 */
public class DuckTestDriver {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck adapterDuck = new TurkeyAdapter(turkey);

        System.out.println("The turkey says....");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says....");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says....");
        testDuck(adapterDuck);
    }

    private static void testDuck(Duck duck) {

        duck.quack();
        duck.fly();
    }
}