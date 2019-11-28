package com.cauchy.behavior.observer.v7;

import java.util.ArrayList;
import java.util.List;

public class Child {
	private boolean cry = false;
	private List<Observer> observers = new ArrayList<>();
	{
		observers.add(new Dad());
		observers.add(new Mum());
		observers.add(new Dog());
	}

	public boolean isCry() {
		return cry;
	}

	public void wakeUp() {
		System.out.println("Waked Up! Crying");
		cry = true;
		WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed",this);
		for (Observer o : observers) {
			o.actionOnWakeUp(event);
		}

	}
}
