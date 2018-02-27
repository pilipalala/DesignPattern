package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/26.18:02
 *         TODO
 */
//NyPizzaStore扩展自PizzaStore，所以拥有orderPizza()方法(以及其他方法)。
public class NyPizzaStore extends PizzaStore {
    //createPizza()返回一个Pizza对象，由子类全权负责该实例化哪个具体Pizza
    //必须实现createPizza()方法，因为在PizzaStore里他是抽象的。
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {

        } else if ("pepperoni".equals(type)) {

        } else if ("clam".equals(type)) {

        } else if ("veggie".equals(type)) {

        }
        return pizza;
    }
}
