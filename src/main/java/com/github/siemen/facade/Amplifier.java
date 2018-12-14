
package com.github.siemen.facade;

/**
 * <b>描述：</b> <br/>
 *
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public class Amplifier {
    private DVDPlayer dvd;

    public void on() {
        System.out.println("Amplifier is on....");
    }

    public void setDvd(DVDPlayer dvd) {
        this.dvd = dvd;
    }

    public void setVolume(int vol) {
        System.out.println("turn volume to :" + vol);
    }

    public void off() {
        System.out.println("Amplifier is off....");
    }
}