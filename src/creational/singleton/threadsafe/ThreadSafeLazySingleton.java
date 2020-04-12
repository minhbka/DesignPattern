package creational.singleton.threadsafe;

public class ThreadSafeLazySingleton {
    private static volatile ThreadSafeLazySingleton instance;
    private ThreadSafeLazySingleton(){

    }
    public static synchronized ThreadSafeLazySingleton getInstance(){
        if (instance == null){
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }
}
