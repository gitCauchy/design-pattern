package com.cauchy.behavior.state.v2;

public class MM {
	String name;
	MMState state;
	public void smile() {
		state.smile();
	}
	public void sad() {
		state.sad();
	}
	public void say() {
		state.say();
	}

}
