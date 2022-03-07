package com.cauchy.behavior.iterator;

/**
 * @author Cauchy
 * @ClassName Collection.java
 * @Date 2019年11月30日
 * @Description 迭代器模式，各种数据结构不一致，很难有一致的遍历方式，所以每一种数据结构自己来实现自己的遍历方法。
 * 使用泛型，可以在集合中放置各种类型。
 * @Version
 */
public interface Collection<E> {
    void add(E o);

    int size();

    Iterator iterator();
}
