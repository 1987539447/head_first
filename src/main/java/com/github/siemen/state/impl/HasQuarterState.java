
package com.github.siemen.state.impl;

import com.github.siemen.state.GumballMachine;
import com.github.siemen.state.State;
import java.util.Random;

/**
 * <b>描述：状态实现- HasQuarter</b> <br/>
 *
 * <b>时间：</b>2018-05-29<br/>
 *
 */
public class HasQuarterState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());

    }

    @Override
    public void turnCrank() {
        System.out.println("You turned....");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && this.gumballMachine.getCount() > 1) {
            this.gumballMachine.setState(this.gumballMachine.getWinnerState());
        } else {
            this.gumballMachine.setState(this.gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }
}