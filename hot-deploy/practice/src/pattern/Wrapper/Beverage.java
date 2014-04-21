package pattern.Wrapper;

/**
 * Created by root on 14-4-21.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    /**
     * 计算费用
     * @return
     */
    public abstract double cost();

}
