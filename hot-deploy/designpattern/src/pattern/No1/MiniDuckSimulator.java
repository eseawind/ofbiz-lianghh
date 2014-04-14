package pattern.No1;

import org.ofbiz.service.DispatchContext;
import pattern.No1.achieve.MallardDuck;
import pattern.No1.achieve.ModelDuck;
import pattern.No1.achieve.implachieve.FlyRocketPowered;
import pattern.No1.main.Duck;

import java.util.Map;

import org.ofbiz.service.ServiceUtil;

/**
 * Created by root on 14-4-1.
 */
public class MiniDuckSimulator {

    /**
     * 测试代码入口
     */
    public static Map<String, Object> run(DispatchContext dctx, Map<String, ? extends Object> context) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        return ServiceUtil.returnSuccess();

    }

}
