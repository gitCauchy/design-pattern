package com.cauchy.behavior.strategy;

public class Dog implements Comparable<Dog>{
	private int weight;

	public Dog(int weight) {
		super();
		this.weight = weight;
	}

	public String toString() {
		return "Dog [weight=" + weight + "]";
	}

	public int compareTo(Dog t) {
		if (this.weight > t.weight) {
			return 1;
		}else if(this.weight < t.weight) {
			return -1;
		}else {
			return 0;
		}
	}
}
