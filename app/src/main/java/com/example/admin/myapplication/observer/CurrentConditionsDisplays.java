package com.example.admin.myapplication.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wangyujie
 *         on 2018/1/24.11:54
 *         TODO
 */

public class CurrentConditionsDisplays implements Observer {
    private Observable weatherData;
    private float temp, humidity, pressure;

    public CurrentConditionsDisplays(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }


    public void display() {
        Log.e("display-->", "1-CurrentConditionsDisplays: " + "temp-->" + temp + "humidity-->" + humidity + "pressure-->" + pressure);
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
