package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton04.java
 * @Date 2019��11��29��
 * @Description �Ľ�������ʽ��ͨ����Сͬ�������ķ�ʽ���Ч��,����ʵ���ϲ�û�н������
 * 				���磬���߳�thread1 ���е�label��λ�ã�ʱ��Ƭ���꣬thread2ִ�н���
 * 				if �ӿ��ж�INSTANCE == NULL ����ͬ���飬���ʵ�������������������
 * 				�̲߳���ȫ���⡣
 * @Version 
 *
 */
public class Singleton04 {
	private static Singleton04 INSTANCE;

	private Singleton04() {
	}

	private static Singleton04 getInstance() {
		if (INSTANCE == null) {
			// label
			synchronized (Singleton04.class) {
				INSTANCE = new Singleton04();
			}
		}
		return INSTANCE;
	}
}
