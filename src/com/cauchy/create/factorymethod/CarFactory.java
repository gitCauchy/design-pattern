package com.cauchy.create.factorymethod;

/**
 * 
 * @author Cauchy
 * @ClassName CarFactory.java
 * @Date 2019��11��29��
 * @Description ����������
 * @Version 
 *
 */
public class CarFactory implements Factory{
	public Car create() {
		return new Car();
	}
}
