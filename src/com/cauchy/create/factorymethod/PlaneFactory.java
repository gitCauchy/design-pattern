package com.cauchy.create.factorymethod;
/**
 * 
 * @author Cauchy
 * @ClassName PlaneFactory.java
 * @Date 2019��11��29��
 * @Description �ɻ�������
 * @Version 
 *
 */
public class PlaneFactory implements Factory {

	public Plane create() {
		return new Plane();
	}
}
