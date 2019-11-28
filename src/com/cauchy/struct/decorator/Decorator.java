package com.cauchy.struct.decorator;

public abstract class Decorator implements Apple {

	protected Apple apple;

	public Decorator(Apple apple) {
		super();
		this.apple = apple;
	}

	public void desc() {
		apple.desc();
	}

}
