package com.cauchy.create.prototype.v2;

public class Person implements Cloneable{
	int age = 8;
	int score = 100;
	Location loc = new Location("bj", 22);
	
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.loc = (Location) loc.clone();
		return p;
	}
}
