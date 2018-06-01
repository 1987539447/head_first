/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.proxy.impl;

import com.github.siemen.proxy.GumballMachineRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * <b>描述：糖果机实现-简化版</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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