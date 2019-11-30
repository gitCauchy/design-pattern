package com.cauchy.behavior.iterator;
/**
 * 
 * @author Cauchy
 * @ClassName Iterator.java
 * @Date 2019年11月30日
 * @Description Iterator接口
 * @Version 
 *
 */
public interface Iterator<E> {
	boolean hasNext();
	E next();
}
