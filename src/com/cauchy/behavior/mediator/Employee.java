package com.cauchy.behavior.mediator;
/**
 * 
 * @author Cauchy
 * @ClassName Employee.java
 * @Date 2019��12��1��
 * @Description �н�ģʽ-Ա�� ͨѶ��Manager����
 * @Version 
 *
 */
public class Employee {
	String name;
	
	private Mediator mediator;

	public Employee(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public void called(String message, String nname) {
		System.out.println(name + "���յ�����" + nname + "������" + message);
	}

	public void call(String message, Employee employee, String nname) {
		System.out.println(nname + "��������" + message);
		mediator.change(message, employee, nname);
	}
}
