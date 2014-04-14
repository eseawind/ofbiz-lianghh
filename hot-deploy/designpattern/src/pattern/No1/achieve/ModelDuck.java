package mangoo.No1.achieve;

import mangoo.No1.achieve.implachieve.FlyNoWay;
import mangoo.No1.achieve.implachieve.Quack;
import mangoo.No1.main.Duck;

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
