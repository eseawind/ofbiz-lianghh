package mangoo.No1.main;

import mangoo.No1.main.impl.FlyBehavior;
import mangoo.No1.main.impl.QuackBehavior;

/**
 * 鸭子父类
 * @author lianghh
 */
public abstract class Duck{

    protected QuackBehavior quackBehavior;

    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 程序运行中动态改变飞行行为
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    /**
     * 程序运行中动态改变鸣叫行为
     * @param qb
     */
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }


    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }


}