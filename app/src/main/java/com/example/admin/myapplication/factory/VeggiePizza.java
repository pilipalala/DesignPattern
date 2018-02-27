package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/27.13:25
 *         TODO
 */

class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    //要制作比萨，需要工厂提供原料。所以每个比萨类都需要从构造器参数中得到一个工厂，并把这个工厂存储在一个实例中
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
