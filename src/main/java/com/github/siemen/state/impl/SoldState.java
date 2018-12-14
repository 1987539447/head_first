
package com.github.siemen.state.impl;

import com.github.siemen.state.GumballMachine;
import com.github.siemen.state.State;

/**
 * <b>描述：状态实现 - Sold</b> <br/>
 *
 * <b>时间：</b>2018-05-29<br/>
 *
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we already give you a gumball");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you have turned the crank");

    }

    @Override
    public void turnCrank() {
        System.out.println("you can't turn twice...");

    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!!");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }

    }
}