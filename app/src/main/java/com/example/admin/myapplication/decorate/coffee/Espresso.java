package com.example.admin.myapplication.decorate.coffee;


import com.example.admin.myapplication.decorate.Beverage;

/**
 * @author wangyujie
 *         on 2018/1/25.11:23
 *         TODO 浓缩
 */
//首先，让Espresso扩展自Beverage类，因为Espresso是一种饮料。
public class Espresso extends Beverage {
    //为了要设置饮料的描述，我们写了一个构造器，description实例变量继承自Beverage
    public Espresso() {
        description = "Espresso";
    }
    //最后，需要计算Espresso的价钱，现在不需要管调料的价钱，直接把Espresso的价格返回即可
    @Override
    public double cost() {
        return 1.99;
    }
}
