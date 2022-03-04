package com.cauchy.create.factorymethod;

/**
 * @author Cauchy
 * @ClassName PlaneFactory.java
 * @Date 2019年11月29日
 * @Description 飞机工厂类
 * @Version
 */
public class PlaneFactory implements Factory {
    @Override
    public Plane create() {
        return new Plane();
    }
}
