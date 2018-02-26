package com.example.admin.myapplication.duck;

/**
 * @author wangyujie
 *         on 2018/1/23.16:42
 *         TODO
 */

public abstract class Duck {
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public abstract void display();

    public void performFly() {
    }

    public void performDuack() {
    }

    public void swim() {
        System.out.println("all ducks float ,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }


}

