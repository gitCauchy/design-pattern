package com.cauchy.behavior.observer.v2;

public class Child {
	private boolean cry = false;
	Dad d = new Dad();
	public boolean isCry(){
		return cry;
	}
	public void wakeUp() {
		System.out.println("Waked Up! Crying");
		cry = true;
		d.feed();
	}
}
