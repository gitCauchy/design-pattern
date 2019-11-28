package com.cauchy.create.singleton;

/**
 * @description 改进的懒汉式
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
