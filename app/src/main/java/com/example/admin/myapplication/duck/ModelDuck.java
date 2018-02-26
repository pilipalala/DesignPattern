package com.example.admin.myapplication.duck;

/**
 * @author wangyujie
 *         on 2018/1/23.17:13
 *         TODO
 */

public class ModelDuck extends Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {

    }
}
