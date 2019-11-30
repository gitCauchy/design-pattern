package com.cauchy.behavior.observer;

/**
 * 
 * @author Cauchy
 * @ClassName Event.java
 * @Date 2019年11月30日
 * @Description 事件抽象类，子类要重写获取事件源的方法
 * @Version
 *
 */
public abstract class Event<T> {

	abstract T getSource();
}
