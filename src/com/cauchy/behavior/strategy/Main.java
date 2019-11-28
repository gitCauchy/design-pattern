package com.cauchy.behavior.strategy;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
//		Dog[] dogs = {new Dog(3),new Dog(2),new Dog(4),new Dog(1)};
//		Sorter s = new Sorter();
//		s.sort(dogs);
//		System.out.println(Arrays.deepToString(dogs));
		Cat[] cats = {new Cat(3,3),new Cat(2,2),new Cat(4,4),new Cat(1,1)};
		Sorter02 s = new Sorter02();
		s.sort(cats, new CatCompareByWeight());
		System.out.println(Arrays.toString(cats));
	}
}
