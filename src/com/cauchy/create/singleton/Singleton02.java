package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton02.java
 * @Date 2019年11月29日
 * @Description 懒汉式，解决了饿汉式产生的问题，但是带来了线程不安全的问题
 * @Version
 *
 */
public class Singleton02 {
	// 创建静态变量，在get方法调用时才初始化对象
	private static Singleton02 INSTANCE;

	// 将构造方法的访问权限设置为private
	private Singleton02() {
	}

	// 获取实例的get方法
	public static Singleton02 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton02();
		}
		return INSTANCE;
	}
}
