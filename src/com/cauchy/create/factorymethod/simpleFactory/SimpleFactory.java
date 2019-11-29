package com.cauchy.create.factorymethod.simpleFactory;

/**
 * 
 * @author Cauchy
 * @ClassName SimpleFactory.java
 * @Date 2019��11��29��
 * @Description �򵥹�������������������ʵ���Ĵ������߼���һ���������ܹ���������ϵͳ�����ܵ�Ӱ��
 * 				�����²�Ʒ��������Ҫ���޸ġ�
 * @Version
 *
 */
public class SimpleFactory {
	public static Product getProduct(String productName) {
		Product product = null;
		switch (productName) {
		case "car":
			product = new Car();
			break;
		case "plane":
			product = new Plane();
			break;
		default:
			break;
		}
		return product;
	}
}
