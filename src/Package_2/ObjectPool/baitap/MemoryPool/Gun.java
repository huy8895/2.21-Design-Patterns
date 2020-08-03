package Package_2.ObjectPool.baitap.MemoryPool;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000;

    //fire pool khi ban lay dan tu be boi pool :>
    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0);
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    pool.freeItem(pp);
                    plist.remove(pp);
                }
            }
            System.out.println();
        }

    }

    // fire khi ban sung ma dan duoc lien tuc tao moi. :>
    public void fire() {
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet bulletNew = new Bullet();
            bulletNew.setPosition(0);
            plist.add(bulletNew);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    plist.remove(pp);
                }
            }
            System.out.println();
        }
    }


}
