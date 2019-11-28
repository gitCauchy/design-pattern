package com.cauchy.struct.decorator;

public class Main {
	public static void main(String[] args) {
		Apple apple = new ConcreteApple();
		System.out.println("------н╢в╟йн------");
		apple.desc();
		System.out.println("----------------");
		test(apple);
	}
	public static void test(Apple apple) {
		ConcreteDecoratorB decorator = new ConcreteDecoratorB(apple);
		System.out.println("------в╟йн╨С-------");
		decorator.desc();
		System.out.println("------------------");
	}
}
