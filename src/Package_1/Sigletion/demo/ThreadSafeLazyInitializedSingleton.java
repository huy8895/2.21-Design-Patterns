package Package_1.Sigletion.demo;

public class ThreadSafeLazyInitializedSingleton {
    private static ThreadSafeLazyInitializedSingleton instance;

    private ThreadSafeLazyInitializedSingleton(){};

    public static synchronized ThreadSafeLazyInitializedSingleton getInstance(){
        if (instance == null){
            return new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }
}
