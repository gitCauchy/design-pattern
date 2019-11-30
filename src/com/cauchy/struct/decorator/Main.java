package com.cauchy.struct.decorator;
/**
 * 
 * @author Cauchy
 * @ClassName Main.java
 * @Date 2019��11��30��
 * @Description ������
 * @Version 
 *
 */
public class Main {
	public static void main(String[] args) {
		Apple apple = new ConcreteApple();
		System.out.println("------δװ��------");
		apple.desc();
		System.out.println("----------------");
		test(apple);
	}
	public static void test(Apple apple) {
		GreenDecorator decorator = new GreenDecorator(apple);
		System.out.println("------װ�κ�-------");
		decorator.desc();
		System.out.println("------------------");
	}
}
