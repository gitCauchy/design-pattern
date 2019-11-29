package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton06.java
 * @Date 2019��11��29��
 * @Description ����ʽ�ڲ����ʵ�ַ�ʽ������Singleton06ʱ�����������ڲ��࣬�������Դ���ĵ�����
 * 				����get����ʱ�������ڲ��࣬����ʵ�����̰߳�ȫ������Jvm�����𣬱�֤�ڴ���ֻ��һ��
 * 				Singleton06Holder����
 * @Version 
 *
 */
public class Singleton06 {
	private Singleton06() {
	}

	private static class Singleton06Holder {
		private final static Singleton06 INSTANCE = new Singleton06();
	}

	public static Singleton06 getInstance() {
		return Singleton06Holder.INSTANCE;
	}
}
