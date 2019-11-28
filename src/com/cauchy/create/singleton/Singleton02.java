package com.cauchy.create.singleton;

/**
 * @description 懒汉式，带来了多线程访问的问题
 * @author Cauchy
 *
 */
public class Singleton02 {
	// 创建静态变量
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
