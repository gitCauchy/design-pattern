package com.cauchy.behavior.mediator;
/**
 * 
 * @author Cauchy
 * @ClassName Manager.java
 * @Date 2019��12��1��
 * @Description �н飬��������Ա��֮�����Ϣ
 * @Version 
 *
 */
public class Manager implements Mediator {
	
	public void change(String message, Employee employee, String name) {
		System.out.println("�����յ�" + name + "������" + message);
		System.out.println("����" + name + "�������͸�Ŀ��ְԱ");
		employee.called(message, name);
	}
	
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
