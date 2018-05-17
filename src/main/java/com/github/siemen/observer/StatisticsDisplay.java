/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.observer;

import com.github.siemen.strategy.FlyBehavior;
import java.util.Observable;
import java.util.Observer;

/**
 * <b>描述：观察者 静态显示牌：最大最小平均值</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float max = 0f;
    private float min = Float.MAX_VALUE;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void display() {
        System.out.println("the max temperature:" + max + "the min temperature :" + min);
    }

    public void update(Observable observable, Object obj) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            if (Float.valueOf(weatherData.getTemperature()).compareTo(max) > 0) {
                this.max = weatherData.getTemperature();
            }
            if (Float.valueOf(weatherData.getTemperature()).compareTo(min) < 0) {
                this.min = weatherData.getTemperature();
            }
            display();
        }
    }
}