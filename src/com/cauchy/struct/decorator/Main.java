package com.cauchy.struct.decorator;

public class Main {
	public static void main(String[] args) {
		Apple apple = new ConcreteApple();
		System.out.println("------δװ��------");
		apple.desc();
		System.out.println("----------------");
		test(apple);
	}
	public static void test(Apple apple) {
		ConcreteDecoratorB decorator = new ConcreteDecoratorB(apple);
		System.out.println("------װ�κ�-------");
		decorator.desc();
		System.out.println("------------------");
	}
}
