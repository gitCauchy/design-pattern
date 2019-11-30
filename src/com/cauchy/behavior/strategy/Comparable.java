package com.cauchy.behavior.strategy;
/**
 * 
 * @author Cauchy
 * @ClassName Comparable.java
 * @Date 2019年11月30日
 * @Description 比较接口，实现此接口需要重写compareTo方法
 * @Version 
 *
 */
public interface Comparable<T> {
	
	int compareTo(T t);
}
