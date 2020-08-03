package Package_1.Sigletion;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){};

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
class Test{
    EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
}

class Student{
    private static final Student student = new Student();

    private Student(){};

    private static Student getInstance(){
        return student;
    }
}