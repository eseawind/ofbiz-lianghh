package pattern.Wrapper.components;

import pattern.Wrapper.Beverage;

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
