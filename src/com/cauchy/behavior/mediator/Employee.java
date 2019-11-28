package com.cauchy.behavior.mediator;

public class Employee {
	String name;
	private Mediator mediator;

	public Employee(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public void called(String message, String nname) {
		System.out.println(name + "接收到来自" + nname + "的需求：" + message);
	}

	public void call(String message, Employee employee, String nname) {
		System.out.println(nname + "发起需求：" + message);
		mediator.change(message, employee, nname);
	}
}
