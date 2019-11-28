package com.cauchy.create.singleton;

public class Singleton04 {
	private static Singleton04 INSTANCE;

	private Singleton04() {
	}

	private static Singleton04 getInstance() {
		if (INSTANCE == null) {
			// 妄图以减小同步代码块的方式提高效率
			synchronized (Singleton04.class) {
				INSTANCE = new Singleton04();
			}
		}
		return INSTANCE;
	}
}
