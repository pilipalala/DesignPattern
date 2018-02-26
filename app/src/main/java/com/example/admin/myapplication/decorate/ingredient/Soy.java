package com.example.admin.myapplication.decorate.ingredient;

import com.example.admin.myapplication.decorate.Beverage;
import com.example.admin.myapplication.decorate.CondimentDecorator;

/**
 * @author wangyujie
 *         on 2018/1/25.15:26
 *         TODO 豆浆
 */

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Soy";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();

    }
}
