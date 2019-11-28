package com.cauchy.behavior.observer.v6;

public class Dog implements Observer{
	public void bark() {
		System.out.println("dog barking...");
	}

	@Override
	public void actionOnWakeUp(WakeUpEvent event) {
		bark();
		
	}
}
