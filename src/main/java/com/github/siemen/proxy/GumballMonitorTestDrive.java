
package com.github.siemen.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * <b>描述：测试监控</b> <br/>
 *
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