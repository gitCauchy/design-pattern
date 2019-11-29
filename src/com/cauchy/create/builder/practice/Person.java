package com.cauchy.create.builder.practice;

/**
 * 
 * @author Cauchy
 * @ClassName Person.java
 * @Date 2019��11��29��
 * @Description Builderģʽ��ϰ��-Person��
 * @Version
 *
 */
public class Person {
	/*
	 * ����
	 */
	String name;
	/*
	 * ����
	 */
	int age;
	/*
	 * �Ա� 0 - �� 1 - Ů
	 */
	int sex;
	/*
	 * ���
	 */
	float height;
	/*
	 * ����
	 */
	float weight;
	/*
	 * סַ
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
