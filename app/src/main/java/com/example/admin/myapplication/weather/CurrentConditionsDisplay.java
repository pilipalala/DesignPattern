package com.example.admin.myapplication.weather;

import android.util.Log;

/**
 * @author wangyujie
 *         on 2018/1/24.11:54
 *         TODO
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private float temp, humidity, pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void updata(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        Log.e("display-->", "CurrentConditionsDisplays: " + "temp-->" + temp + "humidity-->" + humidity + "pressure-->" + pressure);
    }
}
