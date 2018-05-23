/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.adapter;

import com.github.siemen.adapter.impl.MallardDuck;
import com.github.siemen.adapter.impl.WildTurkey;

/**
 * <b>描述：测试类</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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