
package com.github.siemen.proxy;

import com.github.siemen.proxy.impl.GumballMachine;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * <b>描述：糖果机测试驱动</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the location of gumball machine>>:");
        String location = scanner.nextLine();
        System.out.print("Please input the number of gumball>>:");
        int number = scanner.nextInt();
        GumballMachine gumballMachine = new GumballMachine(location, number);
        Naming.rebind("localhost/gumballmachine", gumballMachine);
    }
}