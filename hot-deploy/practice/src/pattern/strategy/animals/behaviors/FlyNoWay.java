package pattern.strategy.animals.behaviors;

import pattern.strategy.animal.behavior.*;

/**
 * Created by root on 14-4-1.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly(){
        System.out.println("I can't fly!!");
    }

}
