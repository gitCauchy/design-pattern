package com.cauchy.struct.briage.practice;

/**
 * @author Cauchy
 * @ClassName Square.java
 * @Date 2019年12月1日
 * @Description 正方形
 * @Version
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.print(this);
    }

    @Override
    public String toString() {
        return "Square";
    }


}
