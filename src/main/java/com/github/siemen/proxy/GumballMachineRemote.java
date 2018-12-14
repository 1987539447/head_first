
package com.github.siemen.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * <b>描述：糖果机远程接口</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    String getState() throws RemoteException;
}