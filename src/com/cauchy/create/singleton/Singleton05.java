package com.cauchy.create.singleton;

/**
 * @description ˫�ؼ�鵥��д��
 * @author Cauchy
 *
 */
public class Singleton05 {
	private static Singleton05 INSTANCE;

	private Singleton05() {
	}

	public static Singleton05 getInstance() {
		if (INSTANCE == null) {
			// ˫���ж�
			synchronized (Singleton05.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton05();
				}
			}
		}
		return INSTANCE;
	}
}
