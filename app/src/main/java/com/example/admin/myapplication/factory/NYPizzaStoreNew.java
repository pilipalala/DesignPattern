package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/27.13:18
 *         TODO
 */

public class NYPizzaStoreNew extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese PizzaOld");
        } else if (type.equals("veggies")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggies PizzaOld");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam PizzaOld");
        }
        return pizza;

    }
}
