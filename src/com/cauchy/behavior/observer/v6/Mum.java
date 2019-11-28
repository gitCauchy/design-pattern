package com.cauchy.behavior.observer.v6;

public class Mum implements Observer{
	public void hug() {
		System.out.println("mum hugging...");
	}

	@Override
	public void actionOnWakeUp(WakeUpEvent event) {
		hug();
		
	}
}
