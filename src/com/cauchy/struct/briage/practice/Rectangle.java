package com.cauchy.struct.briage.practice;
/**
 * 
 * @author Cauchy
 * @ClassName Rectangle.java
 * @Date 2019��12��1��
 * @Description ������
 * @Version 
 *
 */
public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	public void draw() {
		color.print(this);
	}

	public String toString() {
		return "Rectangle";
	}
	
}
