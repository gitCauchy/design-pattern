package com.cauchy.behavior.observer.v7;

public class Dad implements Observer {
	public void feed() {
		System.out.println("dad feeding...");
	}

	public void actionOnWakeUp(WakeUpEvent event) {
		feed();
	}
}
