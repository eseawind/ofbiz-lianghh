package pattern.strategy.animals.behaviors;

import pattern.strategy.animal.behavior.*;

/**
 * Created by root on 14-4-1.
 */
public class Squeak implements QuackBehavior {
    public void quack(){
        System.out.println("Squeak");
    }
}
