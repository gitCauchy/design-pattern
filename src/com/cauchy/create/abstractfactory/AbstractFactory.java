package com.cauchy.create.abstractfactory;

/**
 * @author Cauchy
 * @ClassName AbstractFactory.java
 * @Date 2019年11月29日
 * @Description 抽象工厂解决了产品族问题
 * @Version
 */
public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Vichile crateVehicle();

    abstract Weapon createWeapon();
}
