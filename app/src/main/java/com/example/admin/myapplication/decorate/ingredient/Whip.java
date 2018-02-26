package com.example.admin.myapplication.decorate.ingredient;

import com.example.admin.myapplication.decorate.Beverage;
import com.example.admin.myapplication.decorate.CondimentDecorator;

/**
 * @author wangyujie
 *         on 2018/1/25.15:26
 *         TODO 奶泡
 */

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Whip";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();

    }
}
