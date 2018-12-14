
package com.github.siemen.facade;

/**
 * <b>描述：门面测试</b> <br/>
 *
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public class HomeTheaterTestDriver {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = HomeTheaterFacade.build();
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}