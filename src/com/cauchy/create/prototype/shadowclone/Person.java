package com.cauchy.create.prototype.shadowclone;

/**
 * 
 * @author Cauchy
 * @ClassName Person.java
 * @Date 2019��11��29��
 * @Description ǳ��¡
 * @Version
 *
 */
public class Person implements Cloneable {

	int age = 8;
	int score = 100;
	Location loc = new Location("bj", 22);

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person();
		Person p2 = (Person) p1.clone();
		System.out.println(p2.age + " " + p2.score);
		System.out.println(p2.loc);
		/**
		 * Location ������8�ֻ������ͣ�Ϊ��¡ֻ�ǽ����ڴ���new�����Ķ������ڴ��и���һ�ݣ�
		 * ��¡�����Ķ�����ָ��Location�����ָ���ַ��ͬ����������ıȽϽ����ͬ��
		 */
		System.out.println(p1.loc == p2.loc);
		p1.loc.street = "sh";
		System.out.println(p2.loc);
	}
}
