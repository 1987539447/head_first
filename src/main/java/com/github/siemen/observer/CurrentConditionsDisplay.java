
package com.github.siemen.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * <b>描述：观察者 - 显示牌实现</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions:" + this.temperature + "F degrees and "
                + humidity + "% humidity");
    }

    public void update(Observable observable, Object object) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}