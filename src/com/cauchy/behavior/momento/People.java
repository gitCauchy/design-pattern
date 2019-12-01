package com.cauchy.behavior.momento;
/**
 * 
 * @author Cauchy
 * @ClassName People.java
 * @Date 2019年12月1日
 * @Description 备忘录模式，将对象变化的状态保存起来
 * @Version 
 *
 */
public class People {
	/*
	 * 姓名
	 */
	private String name;
	/*
	 * 年龄
	 */
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
	
	public static void main(String[] args) {
		People people = new People("cauchy", 25);
		CreateTaker ct = new CreateTaker();
		PeopleMemento pm = people.saveMemento();
		ct.add("s1", pm);
		people.setAge(28);
		people.setName("Tom");
		pm = people.saveMemento();
		ct.add("s2", pm);
		people.setAge(26);
		people.setName("Lucy");
		System.out.println(people);
		people.recovery(ct.get("s1"));;
		System.out.println(people);
		people.recovery(ct.get("s2"));;
		System.out.println(people);
		
	}
}
