package com.cauchy.create.abstractfactory;
/**
 * 
 * @author Cauchy
 * @ClassName AncientFactory.java
 * @Date 2019��11��29��
 * @Description �Ŵ�����
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
