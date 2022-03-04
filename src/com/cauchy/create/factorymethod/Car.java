package com.cauchy.create.factorymethod;

/**
 * @author Cauchy
 * @ClassName Car.java
 * @Date 2019年11月29日
 * @Description 产品 - 汽车
 * @Version
 */
public class Car implements Product {
    @Override
    public void go() {
        System.out.println("car go");
    }
}
