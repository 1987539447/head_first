
package com.github.siemen.proxy;

import java.rmi.RemoteException;

/**
 * <b>描述：糖果机监视</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class GumballMonitor {

    private GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine ..:"+ gumballMachine.getLocation());
            System.out.println("Current inventory " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current state :" + gumballMachine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}