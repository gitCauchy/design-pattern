package com.cauchy.behavior.templatemethod;
/**
 * 
 * @author Cauchy
 * @ClassName Main.java
 * @Date 2019年11月30日
 * @Description 测试类
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
