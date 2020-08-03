package Package_2.ObjectPool.baitap.MemoryPool;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Start");
        gun.fireInPool(); // co the thu bang fire va quan sat ket qua.
        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count );
    }
}
