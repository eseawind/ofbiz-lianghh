package pattern.No1.achieve;

import pattern.No1.achieve.implachieve.FlyWithWings;
import pattern.No1.achieve.implachieve.Quack;
import pattern.No1.main.Duck;

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
