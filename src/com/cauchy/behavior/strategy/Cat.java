package com.cauchy.behavior.strategy;

/**
 * 
 * @author Cauchy
 * @ClassName Cat.java
 * @Date 2019年11月30日
 * @Description 实体类-猫，两只猫可以根据身高比较，也可以根据体重来比较，或者是其他的比较方式，不同的比较方式就需要 创建不同的比较器
 * @Version
 *
 */
public class Cat {
	/*
	 * 体重
	 */
	int weight;
	/*
	 * 身高
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
