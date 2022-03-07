package com.cauchy.struct.proxy.staticproxy;

/**
 * @author Cauchy
 * @ClassName TankTimeProxy.java
 * @Date 2019年12月1日
 * @Description 运行时间代理
 * @Version
 */
public class TankTimeProxy implements Movable {
    Movable m;

    public TankTimeProxy(Movable m) {
        super();
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
