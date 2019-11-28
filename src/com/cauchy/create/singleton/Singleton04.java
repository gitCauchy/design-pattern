package com.cauchy.create.singleton;

public class Singleton04 {
	private static Singleton04 INSTANCE;

	private Singleton04() {
	}

	private static Singleton04 getInstance() {
		if (INSTANCE == null) {
			// ��ͼ�Լ�Сͬ�������ķ�ʽ���Ч��
			synchronized (Singleton04.class) {
				INSTANCE = new Singleton04();
			}
		}
		return INSTANCE;
	}
}
