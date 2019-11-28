package com.cauchy.behavior.observer.v4;

public class Dad implements Observer{
	public void feed() {
		System.out.println("dad feeding...");
	}

	@Override
	public void actionOnWakeUp() {
		feed();
		
	}
	
}
