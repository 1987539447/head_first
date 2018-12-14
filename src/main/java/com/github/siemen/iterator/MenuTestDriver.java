
package com.github.siemen.iterator;

import com.github.siemen.iterator.impl.DinnerMenu;
import com.github.siemen.iterator.impl.PancakeHouseMenu;
import java.util.Arrays;

/**
 * <b>描述：菜单迭代测试</b> <br/>
 *
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