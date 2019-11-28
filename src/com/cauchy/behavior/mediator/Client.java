package com.cauchy.behavior.mediator;

public class Client {
	public static void main(String[] args) {
		// ����ְԱ�뾭��
		Mediator manager = new Manager();
		Employee employeeA = new Employee(manager, "ְԱA");
		Employee employeeB = new Employee(manager, "ְԱB");
		Employee employeeC = new Employee(manager, "ְԱC");
		// ְԱA������
		String messageA = "��Щ������ҪBְԱ����";
		employeeA.call(messageA, employeeB, employeeA.name);
		// ְԱC������
		String messageC = "��Щ������ҪBְԱǩ��";
		employeeC.call(messageC, employeeB, employeeC.name);
	}
}
