/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.proxy;

import com.github.siemen.proxy.impl.GumballMachine;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * <b>描述：糖果机测试驱动</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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