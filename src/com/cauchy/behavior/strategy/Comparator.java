package com.cauchy.behavior.strategy;

/**
 * @author Cauchy
 * @ClassName Comparator.java
 * @Date 2019年11月30日
 * @Description 比较器接口
 * @Version
 */
public interface Comparator<T> {

    int compare(T o1, T o2);
}
