package com.cauchy.behavior.iterator;

/**
 * 
 * @author Cauchy
 * @ClassName ArrayList.java
 * @Date 2019��11��30��
 * @Description ���Ա��߼������ڵ�����Ԫ�أ��������ڴ���Ҳ���ڡ��ڶ�����������ơ�
 * @Version
 *
 */
public class ArrayList<E> implements Collection<E> {
	E[] objects = (E[]) new Object[10];
	private int index = 0;

	public void add(E o) {
		if (index == objects.length) {
			E[] newObjects = (E[]) new Object[objects.length * 2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index] = o;
		index++;
	}

	public int size() {
		return index;
	}

	public Iterator iterator() {
		return new ArrayListIterator();
	}

	private class ArrayListIterator implements Iterator {

		int currentIndex = 0;

		public boolean hasNext() {
			if (currentIndex >= index) {
				return false;
			}
			return true;
		}

		public E next() {
			E o = objects[currentIndex];
			currentIndex++;
			return o;
		}

	}
}
