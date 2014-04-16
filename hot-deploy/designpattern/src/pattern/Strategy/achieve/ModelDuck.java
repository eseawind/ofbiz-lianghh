package pattern.No1.achieve;

import pattern.No1.achieve.implachieve.FlyNoWay;
import pattern.No1.achieve.implachieve.Quack;
import pattern.No1.main.Duck;

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
