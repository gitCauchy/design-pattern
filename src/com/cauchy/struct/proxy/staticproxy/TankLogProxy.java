package com.cauchy.struct.proxy.staticproxy;

/**
 * @author Cauchy
 * @ClassName TankLogProxy.java
 * @Date 2019年12月1日
 * @Description 日志代理
 * @Version
 */
public class TankLogProxy implements Movable {
    Movable m;

    public TankLogProxy(Movable m) {
        super();
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("Tank begin to move");
        m.move();
        System.out.println("Tank end to move");
    }

}
