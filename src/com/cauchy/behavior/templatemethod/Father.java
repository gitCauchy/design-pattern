package com.cauchy.behavior.templatemethod;

/**
 * 
 * @author Cauchy
 * @ClassName Father.java
 * @Date 2019��11��30��
 * @Description ģ�巽����ָ�����Ҫ�޸ĸ���ķ�����void m()��ֻ��Ҫ������д ����������õķ������ɣ�
 * 				��Ϊ�����op1(),op2()
 * @Version
 *
 */
abstract public class Father {
	void m() {
		op1();
		op2();
	}

	abstract void op1();

	abstract void op2();
}
