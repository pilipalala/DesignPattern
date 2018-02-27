package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/27.9:30
 *         TODO 原料工厂
 */

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
    //每个原料都是一个类
    //在接口中，每个原料都有一个对应的方法创建该原料
    //如果每个工厂实例内部都有某一种通用的机制需要实现，就可以吧这个例子改写成抽象类
}
