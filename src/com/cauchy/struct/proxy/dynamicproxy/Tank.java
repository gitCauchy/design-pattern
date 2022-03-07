package com.cauchy.struct.proxy.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author Cauchy
 * @ClassName Tank.java
 * @Date 2019年12月1日
 * @Description 具体需要被代理的对象
 * @Version
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("Tank moving.....");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHander(tank));
        m.move();
    }

}
