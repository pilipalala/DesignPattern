package com.example.admin.myapplication.duck;

import android.util.Log;

/**
 * @author wangyujie
 *         on 2018/1/23.16:47
 *         TODO
 */

public class MallardDuck extends Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void performFly() {
        flyBehavior.fly();
    }

    @Override
    public void performDuack() {
        quackBehavior.quack();
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        Log.e("DUCK", "MallardDuck!!! " );
    }
}
