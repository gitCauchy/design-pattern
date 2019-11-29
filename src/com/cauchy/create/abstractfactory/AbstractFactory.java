package com.cauchy.create.abstractfactory;
/**
 * 
 * @author Cauchy
 * @ClassName AbstractFactory.java
 * @Date 2019��11��29��
 * @Description ���󹤳�����˲�Ʒ������
 * @Version 
 *
 */
public abstract class AbstractFactory {
	abstract Food createFood();

	abstract Vichile crateVehicle();

	abstract Weapon createWeapon();
}
