package com.cauchy.create.builder.practice;

/**
 * 
 * @author Cauchy
 * @ClassName Person.java
 * @Date 2019年11月29日
 * @Description Builder模式练习题-Person类
 * @Version
 *
 */
public class Person {
	/*
	 * 姓名
	 */
	String name;
	/*
	 * 年龄
	 */
	int age;
	/*
	 * 性别 0 - 男 1 - 女
	 */
	int sex;
	/*
	 * 身高
	 */
	float height;
	/*
	 * 体重
	 */
	float weight;
	/*
	 * 住址
	 */
	Location loc;

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", height=" + height + ", weight=" + weight
				+ ", loc=" + loc + "]";
	}

	public static void main(String[] args) {
		Person person = new PersonBuilder().basicInfo("Cauchy", 25, 0).healthInfo(75, 173).addressInfo("Beijing", 1)
				.builder();
		System.out.println(person);
	}
}
