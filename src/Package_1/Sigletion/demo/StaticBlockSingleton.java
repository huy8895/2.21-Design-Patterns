package Package_1.Sigletion.demo;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getINSTANCE(){
        return INSTANCE;
    }
}

class Test2{
    StaticBlockSingleton instance = StaticBlockSingleton.getINSTANCE();
}
