package com.cauchy.create.abstractfactory;
/**
 * 
 * @author Cauchy
 * @ClassName AncientFactory.java
 * @Date 2019年11月29日
 * @Description 古代工厂
 * @Version 
 *
 */
public class AncientFactory extends AbstractFactory {

	Food createFood() {
		return new SteamBread();
	}

	Vichile crateVehicle() {
		return new Coach();
	}

	Weapon createWeapon() {
		return new Sword();
	}

}
