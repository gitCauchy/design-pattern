package com.cauchy.behavior.strategy;

/**
 * 
 * @author Cauchy
 * @ClassName Cat.java
 * @Date 2019��11��30��
 * @Description ʵ����-è����ֻè���Ը�����߱Ƚϣ�Ҳ���Ը����������Ƚϣ������������ıȽϷ�ʽ����ͬ�ıȽϷ�ʽ����Ҫ ������ͬ�ıȽ���
 * @Version
 *
 */
public class Cat {
	/*
	 * ����
	 */
	int weight;
	/*
	 * ���
	 */
	int height;

	public Cat(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public String toString() {
		return "Cat [weight=" + weight + ", height=" + height + "]";
	}
}
