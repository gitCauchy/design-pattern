package com.cauchy.create.singleton;

/**
 * @description ����ʽ�������˶��̷߳��ʵ�����
 * @author Cauchy
 *
 */
public class Singleton02 {
	// ������̬����
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
