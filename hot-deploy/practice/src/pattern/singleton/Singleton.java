package pattern.singleton;

/**
 * Created by root on 14-4-25.
 */
public class Singleton {

    /**
     * 确保类只被实例化一次
     */
    private volatile static Singleton uniqueInstance;

    /**
     * 外部程序无法实例化该类
     */
    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
