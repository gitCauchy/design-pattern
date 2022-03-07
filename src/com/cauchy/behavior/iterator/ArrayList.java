package com.cauchy.behavior.iterator;

/**
 * @author Cauchy
 * @ClassName ArrayList.java
 * @Date 2019年11月30日
 * @Description 线性表，逻辑上相邻的两个元素，在物理内存中也相邻。在读方面更有优势。
 * @Version
 */
public class ArrayList<E> implements Collection<E> {
    E[] objects = (E[]) new Object[10];
    private int index = 0;

    @Override
    public void add(E o) {
        if (index == objects.length) {
            E[] newObjects = (E[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            E o = objects[currentIndex];
            currentIndex++;
            return o;
        }

    }
}
