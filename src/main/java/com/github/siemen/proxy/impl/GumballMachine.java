
package com.github.siemen.proxy.impl;

import com.github.siemen.proxy.GumballMachineRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * <b>描述：糖果机实现-简化版</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private String location;
    private String state = "noQuarter";
    private int count;

    public GumballMachine(String location, int numbersOfGumballs) throws RemoteException {
        this.count = numbersOfGumballs;
        this.location = location;
    }

    @Override
    public int getCount() throws RemoteException {
        return this.count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return this.location;
    }

    @Override
    public String getState() throws RemoteException {
        return this.state;
    }
}