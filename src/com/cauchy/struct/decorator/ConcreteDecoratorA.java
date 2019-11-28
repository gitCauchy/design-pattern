package com.cauchy.struct.decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Apple apple) {
		super(apple);
	}
	public void descA() {
		System.out.println("被装饰器A扩展修饰");
	}
	
	public void desc() {
		System.out.println("装饰器A=>装饰成为红色的");
		super.desc();
		System.out.println("装饰器A=>装饰结束");
	}

}
