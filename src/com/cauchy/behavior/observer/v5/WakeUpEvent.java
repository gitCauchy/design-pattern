package com.cauchy.behavior.observer.v5;

public class WakeUpEvent {
	long timestamp;
	String loc;
	public WakeUpEvent(long timestamp, String loc) {
		super();
		this.timestamp = timestamp;
		this.loc = loc;
	}
}
