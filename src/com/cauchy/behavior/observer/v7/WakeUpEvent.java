package com.cauchy.behavior.observer.v7;

public class WakeUpEvent extends Event{
	long timestamp;
	String loc;
	Child source;
	public WakeUpEvent(long timestamp, String loc,Child source) {
		super();
		this.timestamp = timestamp;
		this.loc = loc;
		this.source = source;
	}
	Child getSource() {
		return source;
	}
}
