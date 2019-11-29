package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton05.java
 * @Date 2019��11��29��
 * @Description Ϊ�˽��Singleton04.java�����⣬����˫���жϵķ�ʽ������⡣
 * 				��һ��if�������������ڣ������һ���ж�INSTANCE��Ϊ�գ����
 * 				����Ҫ����ִ�У���Լ��Դ��
 * @Version 
 *
 */
public class Singleton05 {
	private static Singleton05 INSTANCE;

	private Singleton05() {
	}

	public static Singleton05 getInstance() {
		if (INSTANCE == null) {
			// ˫���ж�
			synchronized (Singleton05.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton05();
				}
			}
		}
		return INSTANCE;
	}
}
