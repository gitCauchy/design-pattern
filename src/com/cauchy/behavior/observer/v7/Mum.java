package com.cauchy.behavior.observer.v7;

public class Mum implements Observer{
	public void hug() {
		System.out.println("mum hugging...");
	}

	public void actionOnWakeUp(WakeUpEvent event) {
		hug();
	}
}
