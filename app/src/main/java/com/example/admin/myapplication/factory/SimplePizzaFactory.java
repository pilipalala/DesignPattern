package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/26.17:13
 *         TODO SimplePizzaFactory是新的类，他只做一件事情:帮它的客户创建比萨
 *
 */

public class SimplePizzaFactory {
    //首先，在这个工厂内定义一个createPizza()方法，所有客户用这个方法来实例化对象。
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {

        } else if ("pepperoni".equals(type)) {

        } else if ("clam".equals(type)) {

        } else if ("veggie".equals(type)) {

        }
        return pizza;
    }
}
