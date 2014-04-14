package mangoo.No1;

import mangoo.No1.achieve.MallardDuck;
import mangoo.No1.achieve.ModelDuck;
import mangoo.No1.achieve.implachieve.FlyRocketPowered;
import mangoo.No1.main.Duck;

/**
 * Created by root on 14-4-1.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
