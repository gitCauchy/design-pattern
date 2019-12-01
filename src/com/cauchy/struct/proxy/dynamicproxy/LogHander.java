package com.cauchy.struct.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 
 * @author Cauchy
 * @ClassName LogHander.java
 * @Date 2019年12月1日
 * @Description 日志对象
 * @Version 
 *
 */
public class LogHander implements InvocationHandler{

	Tank tank;
	
	public LogHander(Tank tank) {
		super();
		this.tank = tank;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method-" + method.getName() + "-start");
		Object o = method.invoke(tank, args);
		System.out.println("method-" + method.getName() + "-end");
		return o;
	}
}
