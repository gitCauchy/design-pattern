package com.cauchy.struct.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cauchy
 * @ClassName BulletPool.java
 * @Date 2019年11月30日
 * @Description 享元模式-将小对象放置在池子中，使用时无需new，直接从池子里面取
 * @Version
 */
public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();

    {
        for (int i = 0; i < 500; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (!b.living) {
                return b;
            }
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bp = new BulletPool();
        for (int i = 0; i < 1000; i++) {
            Bullet bullet = bp.getBullet();
            System.out.println(bullet);
        }
    }

}
