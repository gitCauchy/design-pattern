package com.cauchy.behavior.iterator.v3;

public interface Collection<E> {
	void add(E o);
	int size();
	Iterator iterator();
}
