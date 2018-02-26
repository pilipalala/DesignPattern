package com.example.admin.myapplication.observer;

import android.util.Log;

import com.example.admin.myapplication.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wangyujie
 *         on 2018/1/24.11:54
 *         TODO
 */

public class StatisticsDisplays implements Observer, DisplayElement {
    private final Observable weatherData;
    private float temp, humidity, pressure;

    public StatisticsDisplays(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }


    @Override
    public void display() {
        Log.e("display-->", "3-StatisticsDisplays: " + "temp-->" + temp + "humidity-->" + humidity + "pressure-->" + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherObservabler) {
            WeatherObservabler observabler = (WeatherObservabler) o;
            this.temp = observabler.getTemperature();
            this.humidity = observabler.getHumidity();
            this.pressure = observabler.getPressure();
            display();
        }
    }
}
