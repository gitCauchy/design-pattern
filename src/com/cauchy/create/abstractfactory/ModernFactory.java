package com.cauchy.create.abstractfactory;

/**
 * @author Cauchy
 * @ClassName ModernFactory.java
 * @Date 2019年11月29日
 * @Description 现代工厂
 * @Version
 */
public class ModernFactory extends AbstractFactory {

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vichile crateVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new Gun();
    }

}
