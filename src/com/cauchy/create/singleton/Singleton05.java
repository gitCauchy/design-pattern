package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton05.java
 * @Date 2019年11月29日
 * @Description 为了解决Singleton04.java的问题，采用双重判断的方式解决问题。
 * 				第一层if代码块的意义在于，如果第一层判断INSTANCE不为空，则程
 * 				不需要向下执行，节约资源。
 * @Version 
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
