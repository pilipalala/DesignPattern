package com.example.admin.myapplication.decorate.coffee;

import com.example.admin.myapplication.decorate.Beverage;

/**
 * @author wangyujie
 *         on 2018/1/25.15:24
 *         TODO 综合
 */

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
