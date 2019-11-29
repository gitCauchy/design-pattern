package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton03.java
 * @Date 2019年11月29日
 * @Description 改进的懒汉式，通过在get方法上添加synchronized关键字来实现加锁解决 多线程问题，
 * 				同时带来了程序的效率问题。
 * @Version
 *
 */
public class Singleton03 {
	private static Singleton03 INSTANCE;

	private Singleton03() {
	}

	public static synchronized Singleton03 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton03();
		}
		return INSTANCE;
	}
}
