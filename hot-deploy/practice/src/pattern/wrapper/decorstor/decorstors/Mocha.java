package pattern.wrapper.decorstor.decorstors;

import pattern.wrapper.Beverage;
import pattern.wrapper.decorstor.CondimentDecorator;

/**
 * Created by root on 14-4-21.
 */
public class Mocha extends CondimentDecorator {

    /**
     * 被装饰对象
     */
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
