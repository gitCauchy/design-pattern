package com.cauchy.behavior.mediator;

public class Manager implements Mediator {

	public void change(String message, Employee employee, String name) {
		System.out.println("�����յ�" + name + "������" + message);
		System.out.println("����" + name + "�������͸�Ŀ��ְԱ");
		employee.called(message, name);
	}
}
