package com.cauchy.create.singleton;

public class Singleton01 {
	// ����ʵ��
	private static final Singleton01 INSTANCE = new Singleton01();

	// �ṩget����
	public static Singleton01 getInstance() {
		return INSTANCE;
	}

	// �����췽������Ϊprivate
	private Singleton01() {
	}
}
