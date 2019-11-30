package com.cauchy.struct.decorator;

/**
 * 
 * @author Cauchy
 * @ClassName Decorator.java
 * @Date 2019��11��30��
 * @Description װ�����ӿ�
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
