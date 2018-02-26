package com.example.admin.myapplication.decorate;

/**
 * @author wangyujie
 *         on 2018/1/25.11:23
 *         TODO 调料装饰
 */
//首先必须让CondimentDecorator能够取代Beverage，所以将CondimentDecorator扩展自Beverage
public abstract class CondimentDecorator extends Beverage {
    //所有的调料装饰者都必须重新实现getDescription方法，稍后我们会解释
    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
