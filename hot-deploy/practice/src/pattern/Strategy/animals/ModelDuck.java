package pattern.Strategy.animals;

import pattern.Strategy.animal.*;
import pattern.Strategy.animal.behavior.*;
import pattern.Strategy.animals.behaviors.*;

/**
 * Created by root on 14-4-1.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
