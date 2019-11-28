package com.cauchy.behavior.observer.v6;

public class WakeUpEvent {
	long timestamp;
	String loc;
	Child source;
	public WakeUpEvent(long timestamp, String loc,Child source) {
		super();
		this.timestamp = timestamp;
		this.loc = loc;
		this.source = source;
	}
}
