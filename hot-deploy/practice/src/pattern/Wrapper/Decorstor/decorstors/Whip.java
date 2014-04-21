package pattern.Wrapper.decorstor.decorstors;

import pattern.Wrapper.Beverage;
import pattern.Wrapper.decorstor.CondimentDecorator;

/**
 * Created by root on 14-4-21.
 */
public class Whip extends CondimentDecorator {

    /**
     * 被装饰对象
     */
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
