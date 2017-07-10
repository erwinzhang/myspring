package designpattern;

/**
 * Created by erzhang on 6/13/17.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){};

    public static Singleton  getInstance(){
        return SingletonInstance.instance;
    }

    private static class SingletonInstance{
        static Singleton instance = new Singleton();
    }

}
