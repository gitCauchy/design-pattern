package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton02.java
 * @Date 2019��11��29��
 * @Description ����ʽ������˶���ʽ���������⣬���Ǵ������̲߳���ȫ������
 * @Version
 *
 */
public class Singleton02 {
	// ������̬��������get��������ʱ�ų�ʼ������
	private static Singleton02 INSTANCE;

	// �����췽���ķ���Ȩ������Ϊprivate
	private Singleton02() {
	}

	// ��ȡʵ����get����
	public static Singleton02 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton02();
		}
		return INSTANCE;
	}
}
