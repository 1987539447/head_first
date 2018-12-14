
package com.github.siemen.facade;

/**
 * <b>描述：</b> <br/>
 *
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public class DVDPlayer {
    public void on() {
        System.out.println("DVD player is on ....");
    }

    public void play(String movie) {
        System.out.println("Begin to play movie:" + movie);
    }

    public void stop() {
        System.out.println("DVD player is stop....");
    }

    public void off() {
        System.out.println("DVD player is off....");
    }
}