package com.cauchy.create.prototype.shadowclone;

/**
 * 
 * @author Cauchy
 * @ClassName Person.java
 * @Date 2019年11月29日
 * @Description 浅克隆
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
		 * Location 并不是8种基本类型，为克隆只是将堆内存中new出来的对象，在内存中复制一份，
		 * 克隆出来的对象在指向Location对象的指针地址相同，所以输出的比较结果相同。
		 */
		System.out.println(p1.loc == p2.loc);
		p1.loc.street = "sh";
		System.out.println(p2.loc);
	}
}
