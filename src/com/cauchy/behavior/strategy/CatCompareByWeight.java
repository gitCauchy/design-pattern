package com.cauchy.behavior.strategy;

public class CatCompareByWeight implements Comparator<Cat>{
	public int compare(Cat c1, Cat c2) {
		if (c1.weight < c2.weight) {
			return -1;
		} else if (c1.weight > c2.weight) {
			return 1;
		} else {
			return 0;
		}
	}
}
