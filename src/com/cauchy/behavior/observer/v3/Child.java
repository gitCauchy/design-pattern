package com.cauchy.behavior.observer.v3;

public class Child {
	private boolean cry = false;
	Dad d = new Dad();
	Mum m = new Mum();
	Dog dog = new Dog();
	public boolean isCry(){
		return cry;
	}
	public void wakeUp() {
		System.out.println("Waked Up! Crying");
		cry = true;
		d.feed();
		m.hug();
		dog.bark();
	}
}
