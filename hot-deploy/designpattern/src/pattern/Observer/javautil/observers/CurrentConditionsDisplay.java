package pattern.Observer.javautil.observers;

import org.ofbiz.base.util.Debug;
import pattern.Observer.javautil.subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lianghh on 14-4-19.
 */
public class CurrentConditionsDisplay implements Observer {

    /**
     * 关注的主题
     */
    Observable observable;

    /**
     * 当前温度
     */
    private float temperature;

    /**
     * 当前湿度
     */
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 获取推送的回调方法
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    /**
     * 更新显示面板
     */
    public void display(){
        Debug.logError("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity","");
    }
}
