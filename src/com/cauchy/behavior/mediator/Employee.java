package com.cauchy.behavior.mediator;
/**
 *
 * @author Cauchy
 * @ClassName Employee.java
 * @Date 2019年12月1日
 * @Description 中介模式-员工 通讯有Manager传递
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

    public void called(String message, String name) {
        System.out.println(this.name + "接收到来自" + name + "的需求：" + message);
    }

    public void call(String message, Employee employee, String name) {
        System.out.println(name + "发起需求：" + message);
        mediator.change(message, employee, name);
    }
}
