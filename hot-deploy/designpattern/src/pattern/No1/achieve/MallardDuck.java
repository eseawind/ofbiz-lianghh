package mangoo.No1.achieve;

import mangoo.No1.achieve.implachieve.FlyWithWings;
import mangoo.No1.achieve.implachieve.Quack;
import mangoo.No1.main.Duck;

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
