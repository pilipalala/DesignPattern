package com.example.admin.myapplication.observer;

import java.util.Observable;

/**
 * @author wangyujie
 *         on 2018/1/24.9:49
 *         TODO
 *         当一个对象改变状态时,他的所有依赖者都会收到通知并自动更新。
 */

public class WeatherObservabler extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherObservabler() {
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
