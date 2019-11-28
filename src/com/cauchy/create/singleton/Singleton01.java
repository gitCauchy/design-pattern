package com.cauchy.create.singleton;

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
