/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.state.impl;

import com.github.siemen.state.GumballMachine;
import com.github.siemen.state.State;

/**
 * <b>描述：状态实现 - 中奖</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-29<br/>
 *
 */
public class WinnerState implements State {


    private GumballMachine gumballMachine;


    @Override
    public void insertQuarter() {
        System.out.println("please wait...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have turned crank...");
    }

    @Override
    public void turnCrank() {
        System.out.println("can't turn twice...");

    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() >1) {
            System.out.println("Your Are A Winner!!!! Got another gumball...");
            this.gumballMachine.releaseBall();
        }
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumball");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }


    }
}