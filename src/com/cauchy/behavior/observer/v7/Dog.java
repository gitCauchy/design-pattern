package com.cauchy.behavior.observer.v7;

public class Dog implements Observer{
	public void bark() {
		System.out.println("dog barking...");
	}

	public void actionOnWakeUp(WakeUpEvent event) {
		bark();
	}
}
