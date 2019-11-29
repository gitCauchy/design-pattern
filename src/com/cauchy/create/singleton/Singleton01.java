package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton01.java
 * @Date 2019年11月29日
 * @Description 饿汉式，实现方式是常量成员变量，唯一缺陷是无论是否需要 调用获取对象方法，都会创建实例。
 * @Version
 *
 */
public class Singleton01 {
	// 创建实例
	private static final Singleton01 INSTANCE = new Singleton01();

	// 提供get方法
	public static Singleton01 getInstance() {
		return INSTANCE;
	}

	// 将构造方法设置为private
	private Singleton01() {
	}
}
