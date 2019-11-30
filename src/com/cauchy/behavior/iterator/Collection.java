package com.cauchy.behavior.iterator;
/**
 * 
 * @author Cauchy
 * @ClassName Collection.java
 * @Date 2019��11��30��
 * @Description ������ģʽ���������ݽṹ��һ�£�������һ�µı�����ʽ������ÿһ�����ݽṹ�Լ���ʵ���Լ��ı���������
 * 				ʹ�÷��ͣ������ڼ����з��ø������͡�
 * @Version 
 *
 */
public interface Collection<E> {
	void add(E o);
	int size();
	Iterator iterator();
}
