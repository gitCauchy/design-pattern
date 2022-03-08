package com.cauchy.struct.decorator.practice;

/**
 * 三角形
 *
 * @author Cauchy
 * @date 2022/03/08 08:23
 **/
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
