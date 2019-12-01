package com.cauchy.struct.briage.practice;

/**
 * 
 * @author Cauchy
 * @ClassName Shape.java
 * @Date 2019��12��1��
 * @Description ��״������
 * @Version
 *
 */
public abstract class Shape {
	Color color;

	public void setColor(Color color) {
		this.color = color;
	}
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	public abstract void draw();
}
