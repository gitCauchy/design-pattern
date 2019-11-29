package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton01.java
 * @Date 2019��11��29��
 * @Description ����ʽ��ʵ�ַ�ʽ�ǳ�����Ա������Ψһȱ���������Ƿ���Ҫ ���û�ȡ���󷽷������ᴴ��ʵ����
 * @Version
 *
 */
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
