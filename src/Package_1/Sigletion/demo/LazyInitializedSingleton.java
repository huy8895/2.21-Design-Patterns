package Package_1.Sigletion.demo;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){};

    public static LazyInitializedSingleton getInstance(){
        if (instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

class StudentLazy{
    private static StudentLazy instance;

    private StudentLazy(){};

    public static StudentLazy getInstance(){
        if (instance == null){
            instance = new StudentLazy();
        }
        return instance;
    }
}

