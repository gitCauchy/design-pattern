package com.cauchy.behavior.mediator;

public class Manager implements Mediator {

	public void change(String message, Employee employee, String name) {
		System.out.println("经理收到" + name + "的需求：" + message);
		System.out.println("经理将" + name + "的需求发送给目标职员");
		employee.called(message, name);
	}
}
