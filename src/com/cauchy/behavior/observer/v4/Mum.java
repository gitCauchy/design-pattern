package com.cauchy.behavior.observer.v4;

public class Mum implements Observer{
	public void hug() {
		System.out.println("mum hugging...");
	}

	@Override
	public void actionOnWakeUp() {
		hug();
		
	}
}
