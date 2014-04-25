package pattern.wrapper;

/**
 * Created by root on 14-4-21.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    /**
     * 计算费用
     * @return
     */
    public abstract double cost();

}
