package com.cauchy.create.abstractfactory;

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
