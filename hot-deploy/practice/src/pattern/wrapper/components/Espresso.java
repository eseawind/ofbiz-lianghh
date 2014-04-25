package pattern.wrapper.components;

import pattern.wrapper.Beverage;

/**
 * Created by root on 14-4-21.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
