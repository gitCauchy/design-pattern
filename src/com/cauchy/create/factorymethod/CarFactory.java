package com.cauchy.create.factorymethod;

/**
 * 
 * @author Cauchy
 * @ClassName CarFactory.java
 * @Date 2019年11月29日
 * @Description 汽车工厂类
 * @Version 
 *
 */
public class CarFactory implements Factory{
	public Car create() {
		return new Car();
	}
}
