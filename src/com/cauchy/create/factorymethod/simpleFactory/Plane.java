package com.cauchy.create.factorymethod.simpleFactory;
/**
 * 
 * @author Cauchy
 * @ClassName Plane.java
 * @Date 2019年11月29日
 * @Description 产品 - 飞机
 * @Version 
 *
 */
public class Plane implements Product {
	public void go() {
		System.out.println("plane go");
	}
}
