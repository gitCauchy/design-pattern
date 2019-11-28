package com.cauchy.behavior.observer;

public class Child {
	private boolean cry = false;
	public boolean isCry(){
		return cry;
	}
	public void wakeUp() {
		System.out.println("Waked Up! Crying");
		cry = true;
	}
}
