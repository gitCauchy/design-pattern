package com.cauchy.struct.briage.practice;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	public void draw() {
		color.print(this);
	}

	public String toString() {
		return "Circle";
	}

}
