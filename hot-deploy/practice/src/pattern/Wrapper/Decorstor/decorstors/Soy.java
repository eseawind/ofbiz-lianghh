package pattern.Wrapper.decorstor.decorstors;

import pattern.Wrapper.Beverage;
import pattern.Wrapper.decorstor.CondimentDecorator;

/**
 * Created by root on 14-4-21.
 */
public class Soy extends CondimentDecorator {

    /**
     * 被装饰对象
     */
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
