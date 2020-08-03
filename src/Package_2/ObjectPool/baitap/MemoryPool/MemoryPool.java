package Package_2.ObjectPool.baitap.MemoryPool;

import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> poolItems = new LinkedList<>();

    public void freeItem(T items){
        poolItems.add(items);
    }

    public T newItem(){
        T out = null;
        if (poolItems.size() == 0){
            out = allocate();

        } else {
            out = poolItems.getFirst();
            poolItems.removeFirst();
        }

        return out;
    }

    protected abstract T allocate();

}
