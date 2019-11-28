package com.cauchy.create.singleton;

/**
 * @description 双重检查单例写法
 * @author Cauchy
 *
 */
public class Singleton05 {
	private static Singleton05 INSTANCE;

	private Singleton05() {
	}

	public static Singleton05 getInstance() {
		if (INSTANCE == null) {
			// 双重判断
			synchronized (Singleton05.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton05();
				}
			}
		}
		return INSTANCE;
	}
}
