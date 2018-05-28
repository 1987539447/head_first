/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.iterator;

import com.github.siemen.iterator.impl.DinnerMenu;
import com.github.siemen.iterator.impl.PancakeHouseMenu;
import java.util.Arrays;

/**
 * <b>描述：菜单迭代测试</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-28<br/>
 *
 */
public class MenuTestDriver {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinnerMenu));
        waitress.printMenu();
    }
}