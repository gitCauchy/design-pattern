package com.cauchy.behavior.mediator;
/**
 * 
 * @author Cauchy
 * @ClassName Manager.java
 * @Date 2019年12月1日
 * @Description 中介，传递两个员工之间的消息
 * @Version 
 *
 */
public class Manager implements Mediator {
	
	public void change(String message, Employee employee, String name) {
		System.out.println("经理收到" + name + "的需求：" + message);
		System.out.println("经理将" + name + "的需求发送给目标职员");
		employee.called(message, name);
	}
	
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
