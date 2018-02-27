package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/27.11:48
 *         TODO
 */

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    //要制作比萨，需要工厂提供原料。所以每个比萨类都需要从构造器参数中得到一个工厂，并把这个工厂存储在一个实例中
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
    //Pizza的代码利用相关的工厂生产原料。所生产的原料依赖所使用的工厂，
    // Pizza类根本不关心这些原料，他只知道如何制作比萨。
    // 现在，Pizza和区域原料之间被解耦，无论原料工厂是在洛基山脉还是西北沿岸地区，Pizza类都可以轻易地复用完全没问题。
    // sauce = ingredientFactory.createSauce();


    //sauce：把pizza的实例变量设置为此比萨所使用的某种酱料
    //ingredientFactory：这是原料工厂，pizza不在乎使用什么工厂，只要是原料工厂就行了。
    //createSauce()：方法会返回这个区域所使用的酱料。如果这是一个纽约原料工厂，我们将取得大蒜番茄酱料
}
