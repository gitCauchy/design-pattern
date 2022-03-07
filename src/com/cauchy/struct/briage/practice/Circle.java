package com.cauchy.struct.briage.practice;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.print(this);
    }

    @Override
    public String toString() {
        return "Circle";
    }

}
