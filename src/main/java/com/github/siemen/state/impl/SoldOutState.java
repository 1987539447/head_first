/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.state.impl;

import com.github.siemen.state.GumballMachine;
import com.github.siemen.state.State;

/**
 * <b>描述：状态实现-SoldOut</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-29<br/>
 *
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, gumball has sold out...");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't insert a quarter");

    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...The gumball has sold out");

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");

    }
}