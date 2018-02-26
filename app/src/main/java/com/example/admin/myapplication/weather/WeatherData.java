package com.example.admin.myapplication.weather;

import java.util.ArrayList;

/**
 * @author wangyujie
 *         on 2018/1/24.9:49
 *         TODO
 *         当一个对象改变状态时,他的所有依赖者都会收到通知并自动更新。
 */

    public class WeatherData implements Subject {
        private ArrayList observers;
        private float temperature;
        private float humidity;
        private float pressure;

        public WeatherData() {
            observers = new ArrayList();
        }

        public void setMeasurements(float temperature, float humidity, float pressure) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            measurementsChanged();
        }

        public void measurementsChanged() {
            notifyObservers();
        }

        @Override
        public void registerObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            int i = observers.indexOf(observer);
            if (i >= 0) {
                observers.remove(i);
            }

        }

        @Override
        public void notifyObservers() {
            for (int i = 0; i < observers.size(); i++) {
                Observer observer = (Observer) observers.get(i);
                observer.updata(temperature, humidity, pressure);
            }
        }
    }
