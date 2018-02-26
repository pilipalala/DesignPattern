package com.example.admin.myapplication.weather;

/**
 * @author wangyujie
 *         on 2018/1/24.11:32
 *         TODO
 */

public interface Observer {
    //当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者
    public void updata(float temp, float humidity, float pressure);
}
