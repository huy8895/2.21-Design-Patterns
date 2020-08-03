package Package_2.ObjectPool.ThucHanh;

import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private long expirationTime;

    private Hashtable<T , Long> locked, unlocked;

    public ObjectPool(){
        expirationTime = 30000; //30s
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);

    public synchronized T checkout(){
        long now = System.currentTimeMillis();
        return null;
       // if (locked)
    }
}
