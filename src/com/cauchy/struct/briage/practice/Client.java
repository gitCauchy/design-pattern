package com.cauchy.struct.briage.practice;

/**
 * 
 * @author Cauchy
 * @ClassName Client.java
 * @Date 2019��12��1��
 * @Description ������
 * @Version
 *
 */
public class Client {
	public static void main(String[] args) {
		Shape square = new Square(new White());
		square.draw();
	}
}
