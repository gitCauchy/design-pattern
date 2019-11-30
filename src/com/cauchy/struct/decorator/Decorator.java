package com.cauchy.struct.decorator;

/**
 * 
 * @author Cauchy
 * @ClassName Decorator.java
 * @Date 2019年11月30日
 * @Description 装饰器接口
 * @Version
 *
 */
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
