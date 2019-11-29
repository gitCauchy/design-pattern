package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton03.java
 * @Date 2019��11��29��
 * @Description �Ľ�������ʽ��ͨ����get���������synchronized�ؼ�����ʵ�ּ������ ���߳����⣬
 * 				ͬʱ�����˳����Ч�����⡣
 * @Version
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
