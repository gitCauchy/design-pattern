package com.cauchy.behavior.momento;

public class People {
	private String name;
	private int age;
	
	public PeopleMemento saveMemento() {
		return new PeopleMemento(this);
	}
	
	public void recovery(PeopleMemento pm) {
		this.name = pm.getName();
		this.age = pm.getAge();
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
}
