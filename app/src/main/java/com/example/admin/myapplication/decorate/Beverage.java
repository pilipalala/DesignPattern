package com.example.admin.myapplication.decorate;

/**
 * @author wangyujie
 *         on 2018/1/25.11:24
 *         TODO 调料
 */

public abstract class Beverage {

    public String description = "Unkown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
