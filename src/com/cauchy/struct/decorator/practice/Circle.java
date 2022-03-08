package com.cauchy.struct.decorator.practice;

/**
 * 圆形
 *
 * @author Cauchy
 * @date 2022/03/08 08:25
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
