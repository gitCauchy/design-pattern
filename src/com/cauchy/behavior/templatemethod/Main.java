package com.cauchy.behavior.templatemethod;
/**
 * 
 * @author Cauchy
 * @ClassName Main.java
 * @Date 2019��11��30��
 * @Description ������
 * @Version 
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Father c1 = new Child1();
		Father c2 = new Child2();
		c1.m();
		c2.m();
	}
}
