package com.cauchy.behavior.strategy;

/**
 * 
 * @author Cauchy
 * @ClassName CatCompareByHeight.java
 * @Date 2019��11��30��
 * @Description ��ϰ�⣺ͨ���Ƚ�è��ߵķ�ʽ���Ƚ�è�Ĵ�С
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
