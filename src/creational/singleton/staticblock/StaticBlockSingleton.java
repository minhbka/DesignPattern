package creational.singleton.staticblock;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){

    }
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }

}
