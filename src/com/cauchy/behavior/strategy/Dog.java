package com.cauchy.behavior.strategy;

/**
 * @author Cauchy
 * @ClassName Dog.java
 * @Date 2019年11月30日
 * @Description Compareable举例
 * @Version
 */
public class Dog implements Comparable<Dog> {
    private int weight;

    public Dog(int weight) {
        super();
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog [weight=" + weight + "]";
    }

    @Override
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
