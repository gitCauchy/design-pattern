package com.cauchy.struct.briage.practice;
/**
 * 
 * @author Cauchy
 * @ClassName Square.java
 * @Date 2019��12��1��
 * @Description ������
 * @Version 
 *
 */
public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	public void draw() {
		color.print(this);
	}

	public String toString() {
		return "Square";
	}
	
	
}
