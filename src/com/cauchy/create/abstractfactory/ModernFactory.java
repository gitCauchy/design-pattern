package com.cauchy.create.abstractfactory;

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
