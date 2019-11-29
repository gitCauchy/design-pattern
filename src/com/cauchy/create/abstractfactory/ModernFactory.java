package com.cauchy.create.abstractfactory;
/**
 * 
 * @author Cauchy
 * @ClassName ModernFactory.java
 * @Date 2019年11月29日
 * @Description 现代工厂
 * @Version 
 *
 */
public class ModernFactory extends AbstractFactory{

	Food createFood() {
		return new Bread();
	}

	Vichile crateVehicle() {
		return new Car();
	}

	Weapon createWeapon() {
		return new Gun();
	}
	
}
