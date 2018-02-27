package com.example.admin.myapplication.factory;

/**
 * @author wangyujie
 *         on 2018/2/27.9:47
 *         TODO
 */

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    abstract void prepare();
    void bake() {
        System.out.println("Back for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    public String printString() {
        //这里打印披萨的代码
        return "";
    }
}
