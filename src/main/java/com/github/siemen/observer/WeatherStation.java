
package com.github.siemen.observer;

/**
 * <b>描述：气象站 调用测试</b> <br/>
 *
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(50, 90, 25.4f);
        weatherData.setMeasurements(40, 60, 19.4f);
    }
}