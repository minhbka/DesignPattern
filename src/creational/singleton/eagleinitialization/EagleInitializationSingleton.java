package creational.singleton.eagleinitialization;

public class EagleInitializationSingleton {
    private static final EagleInitializationSingleton INSTANCE = new EagleInitializationSingleton();

    private EagleInitializationSingleton(){

    }

    public static EagleInitializationSingleton getInstance(){
        return INSTANCE;
    }
}
