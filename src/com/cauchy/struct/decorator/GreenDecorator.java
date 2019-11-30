package com.cauchy.struct.decorator;
/**
 * 
 * @author Cauchy
 * @ClassName GreenDecorator.java
 * @Date 2019��11��30��
 * @Description ��ɫװ����
 * @Version 
 *
 */
public class GreenDecorator extends Decorator {

	public GreenDecorator(Apple apple) {
		super(apple);
	}
	public void descB() {
		System.out.println("��װ������չ����");
	}
	
	public void desc() {
		System.out.println("װ�γ�Ϊ��ɫ��");
		super.desc();
		System.out.println("װ�ν���");
	}

}
