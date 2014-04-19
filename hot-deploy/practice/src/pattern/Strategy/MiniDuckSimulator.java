package pattern.Strategy;

import javolution.util.FastMap;
import org.ofbiz.service.DispatchContext;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import org.ofbiz.service.ServiceUtil;

import pattern.Strategy.animal.*;
import pattern.Strategy.animals.*;
import pattern.Strategy.animals.behaviors.*;

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
