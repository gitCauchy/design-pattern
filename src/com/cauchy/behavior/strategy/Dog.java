package com.cauchy.behavior.strategy;

/**
 * 
 * @author Cauchy
 * @ClassName Dog.java
 * @Date 2019��11��30��
 * @Description TODO
 * @Version Compareable����
 *
 */
public class Dog implements Comparable<Dog> {
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
		} else if (this.weight < t.weight) {
			return -1;
		} else {
			return 0;
		}
	}
}
