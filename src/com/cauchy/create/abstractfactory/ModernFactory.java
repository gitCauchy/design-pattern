package com.cauchy.create.abstractfactory;
/**
 * 
 * @author Cauchy
 * @ClassName ModernFactory.java
 * @Date 2019��11��29��
 * @Description �ִ�����
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
