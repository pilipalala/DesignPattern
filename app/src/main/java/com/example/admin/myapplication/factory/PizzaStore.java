package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/26.17:26
 *         TODO
 */

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        //现在createPizza()方法从工厂对象中移回PizzaStore
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //在PizzaStore里，“工厂方法”现在是抽象的。
    abstract Pizza createPizza(String type);
}
