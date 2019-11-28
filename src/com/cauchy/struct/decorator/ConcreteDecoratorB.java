package com.cauchy.struct.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Apple apple) {
		super(apple);
		// TODO Auto-generated constructor stub
	}
	public void descB() {
		System.out.println("被装饰器B扩展修饰");
	}
	
	public void desc() {
		System.out.println("装饰器B=>装饰成为绿色的");
		super.desc();
		System.out.println("装饰器B=>装饰结束");
	}

}
