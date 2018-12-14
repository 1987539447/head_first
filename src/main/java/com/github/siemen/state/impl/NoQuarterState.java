
package com.github.siemen.state.impl;

import com.github.siemen.state.GumballMachine;
import com.github.siemen.state.State;

/**
 * <b>描述：状态实现-NoQuarter</b> <br/>
 *
 * <b>时间：</b>2018-05-29<br/>
 *
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter....");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need have to pay first");
    }
}