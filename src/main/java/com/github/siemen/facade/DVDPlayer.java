/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.facade;

/**
 * <b>描述：</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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