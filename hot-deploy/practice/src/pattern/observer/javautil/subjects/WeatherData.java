package pattern.observer.javautil.subjects;

import java.util.Observable;

/**
 * Created by lianghh on 14-4-19.
 */
public class WeatherData extends Observable {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 气压
     */
    private float pressure;

    public WeatherData(){

    }

    /**
     * 通知观察者发生改变
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 状态发生改变，设置新的数值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

}
