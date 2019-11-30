package com.cauchy.behavior.facede;

public class SecurityFacade {

	private static Camera camera1, camera2;
	private static Light light1, light2, light3;

	SecurityFacade() {
		camera1 = new Camera();
		camera2 = new Camera();
		light1 = new Light();
		light2 = new Light();
		light3 = new Light();
	}

	public void activate() {
		camera1.turnOn();
		camera2.turnOn();
		light1.turnOn();
		light2.turnOn();
		light3.turnOn();
	}

	public void deactivate() {
		camera1.turnOff();
		camera2.turnOff();
		light1.turnOff();
		light2.turnOff();
		light3.turnOff();
	}
}
