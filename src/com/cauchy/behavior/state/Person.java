package com.cauchy.behavior.state;

/**
 * 
 * @author Cauchy
 * @ClassName Person.java
 * @Date 2019��11��30��
 * @Description ʵ����
 * @Version
 *
 */
public class Person {
	String name;
	PersonState state;

	public void sleep() {
		state.sleep();
	}

	public void eat() {
		state.eat();
	}

	public void drink() {
		state.drink();
	}

	public Person(String name, PersonState state) {
		super();
		this.name = name;
		this.state = state;
	}
	
	public static void main(String[] args) {
		Person person = new Person("Cauchy", new YoungState());
		person.drink();
		person.eat();
		person.sleep();
	}
}
