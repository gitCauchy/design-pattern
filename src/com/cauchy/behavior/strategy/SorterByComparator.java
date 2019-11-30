package com.cauchy.behavior.strategy;
/**
 * 
 * @author Cauchy
 * @ClassName SorterByComparator.java
 * @Date 2019��11��30��
 * @Description ͨ���Ƚ������Ƚ�
 * @Version 
 *
 */
public class SorterByComparator<T> {
	public void sort(T[] arr, Comparator<T> comparator) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
			}
			swap(arr, i, minPos);
		}

	}

	void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
