package pattern.wrapper.components;

import pattern.wrapper.Beverage;

/**
 * Created by root on 14-4-21.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
