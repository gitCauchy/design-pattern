package com.cauchy.behavior.observer.v5;

public class Dad implements Observer{
	public void feed() {
		System.out.println("dad feeding...");
	}

	@Override
	public void actionOnWakeUp(WakeUpEvent event) {
		feed();
		
	}
	
}
