/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.facade;

/**
 * <b>描述：家庭影院门户</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public class HomeTheaterFacade {

    private Amplifier amp;
    private Tuner tuner;
    private DVDPlayer dvdPlayer;
    private Screen screen;
    private PopcornPoper popcornPoper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvdPlayer, Screen screen,
            PopcornPoper popcornPoper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.screen = screen;
        this.popcornPoper = popcornPoper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie....");
        popcornPoper.on();
        popcornPoper.pop();
        screen.down();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting theater down......");
        popcornPoper.off();
        screen.up();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.off();

    }

    public static HomeTheaterFacade build() {

        return new HomeTheaterFacade(new Amplifier(), new Tuner(), new DVDPlayer(),
                new Screen(), new PopcornPoper());
    }
}