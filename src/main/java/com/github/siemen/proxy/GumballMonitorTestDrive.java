/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * <b>描述：测试监控</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        GumballMachineRemote remote = (GumballMachineRemote) Naming.lookup("rmi://localhost/gumballmachine");
        GumballMonitor monitor = new GumballMonitor(remote);
        monitor.report();
    }
}