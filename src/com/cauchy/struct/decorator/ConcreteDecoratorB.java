package com.cauchy.struct.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Apple apple) {
		super(apple);
		// TODO Auto-generated constructor stub
	}
	public void descB() {
		System.out.println("��װ����B��չ����");
	}
	
	public void desc() {
		System.out.println("װ����B=>װ�γ�Ϊ��ɫ��");
		super.desc();
		System.out.println("װ����B=>װ�ν���");
	}

}
