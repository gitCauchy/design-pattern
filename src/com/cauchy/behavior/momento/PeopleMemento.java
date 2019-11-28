package com.cauchy.behavior.momento;

public class PeopleMemento {
	private String name;
	private int age;
	public PeopleMemento(People people) {
		this.name = people.getName();
		this.age = people.getAge();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
