package com.cauchy.create.singleton;

/**
 * @description �Ľ�������ʽ
 * @author Cauchy
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
