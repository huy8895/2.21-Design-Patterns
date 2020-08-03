package Package_1.Sigletion.demo;

public class DoubleCheckLockingSingleton {
    //tu khoa volatile dung de danh dau 1 bien trong java da duooc
    //luu tru trong bo nho chinh. moi lan doc bien volatile se dc doc
    // tu bo nho chinh chu khong phai tu bo nho dem CPU
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){};

    public static DoubleCheckLockingSingleton getInstance(){
        // Do something before get instance ...
        if (instance == null){
            // Do the task too long before create instance ...
            // Block so other threads cannot come into while initialize
            synchronized (DoubleCheckLockingSingleton.class){
                //re-check again. Maybe another thread has initialized before
                instance = new DoubleCheckLockingSingleton();

            }
        }
        return instance;
    }
}


