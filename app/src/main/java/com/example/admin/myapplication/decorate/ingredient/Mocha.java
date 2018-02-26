package com.example.admin.myapplication.decorate.ingredient;

import com.example.admin.myapplication.decorate.Beverage;
import com.example.admin.myapplication.decorate.CondimentDecorator;

/**
 * @author wangyujie
 *         on 2018/1/25.15:26
 *         TODO 摩卡
 */
//摩卡是一个装饰者，所以让它扩展自CondimentDecorator。别忘了，CondimentDecorator扩展自Beverage
public class Mocha extends CondimentDecorator {
    //用一个实例变量记录饮料，也就是被装饰者
    private Beverage beverage;

    //想办法让被装饰者(饮料)被记录到实例变量中。这里的做法是：把饮料当做构造器的参数，再由构造器将此饮料记录在实例变量中。
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    //返回加入调料后的描述
    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Mocha";
    }
    //返回装饰后的价格
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
