/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.state;

import com.github.siemen.state.impl.HasQuarterState;
import com.github.siemen.state.impl.NoQuarterState;
import com.github.siemen.state.impl.SoldOutState;
import com.github.siemen.state.impl.SoldState;

/**
 * <b>描述：糖果机 - 状态上下文</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-29<br/>
 *
 */
public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberOfGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            this.state = this.noQuarterState;
        }
    }


    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuqrter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out of the slot...");
        if (count != 0) {
            count--;
        }
    }



    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int  getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}