package com.cauchy.behavior.mediator;
/**
 * 
 * @author Cauchy
 * @ClassName Mediator.java
 * @Date 2019年12月1日
 * @Description 媒介接口
 * @Version 
 *
 */
public interface Mediator {
	
	void change(String message, Employee employee, String name);
}
