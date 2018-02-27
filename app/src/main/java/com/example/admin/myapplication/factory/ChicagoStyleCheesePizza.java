package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/26.18:17
 *         TODO
 */

public class ChicagoStyleCheesePizza extends PizzaOld {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese PizzaOld";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        //这里覆盖了cut()方法 将比萨切成正方形
        System.out.println("Cutting the pizza into square slices");
    }
}
