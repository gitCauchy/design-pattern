package com.cauchy.struct.decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Apple apple) {
		super(apple);
	}
	public void descA() {
		System.out.println("��װ����A��չ����");
	}
	
	public void desc() {
		System.out.println("װ����A=>װ�γ�Ϊ��ɫ��");
		super.desc();
		System.out.println("װ����A=>װ�ν���");
	}

}
