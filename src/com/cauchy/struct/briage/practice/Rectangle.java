package com.cauchy.struct.briage.practice;
/**
 * 
 * @author Cauchy
 * @ClassName Rectangle.java
 * @Date 2019年12月1日
 * @Description 长方形
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
