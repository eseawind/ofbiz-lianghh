package pattern.strategy.animals;

import pattern.strategy.animal.*;
import pattern.strategy.animal.behavior.*;
import pattern.strategy.animals.behaviors.*;

/**
 * 绿头鸭
 * @author lianghh
 * Created by root on 14-4-1.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }

}
