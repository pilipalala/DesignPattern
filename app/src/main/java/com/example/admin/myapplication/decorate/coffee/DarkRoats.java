package com.example.admin.myapplication.decorate.coffee;

import com.example.admin.myapplication.decorate.Beverage;

/**
 * @author wangyujie
 *         on 2018/1/25.11:23
 *         TODO  深度烘培
 */

public class DarkRoats extends Beverage {
    public DarkRoats() {
        description = "DarkRoats";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
