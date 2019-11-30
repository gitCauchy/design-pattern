package com.cauchy.behavior.strategy;

/**
 * 
 * @author Cauchy
 * @ClassName CatCompareByHeight.java
 * @Date 2019年11月30日
 * @Description 练习题：通过比较猫身高的方式来比较猫的大小
 * @Version
 *
 */
public class CatCompareByHeight implements Comparator<Cat> {

	public int compare(Cat o1, Cat o2) {
		if (o1.height > o2.height) {
			return 1;
		} else if (o1.height < o2.height) {
			return -1;
		} else {
			return 0;
		}
	}
}
