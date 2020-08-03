package Package_1.Sigletion.demo;

public class BillPughSingleton {

    private BillPughSingleton instance;

    private static class SingleOnHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingleOnHelper.INSTANCE;
    }
}

class Test3{
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
    }
}
