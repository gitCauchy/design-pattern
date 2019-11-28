package com.cauchy.behavior.mediator;

public class Client {
	public static void main(String[] args) {
		// 分配职员与经理
		Mediator manager = new Manager();
		Employee employeeA = new Employee(manager, "职员A");
		Employee employeeB = new Employee(manager, "职员B");
		Employee employeeC = new Employee(manager, "职员C");
		// 职员A的需求
		String messageA = "这些资料需要B职员操作";
		employeeA.call(messageA, employeeB, employeeA.name);
		// 职员C的请求
		String messageC = "这些资料需要B职员签名";
		employeeC.call(messageC, employeeB, employeeC.name);
	}
}
