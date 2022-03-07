package com.cauchy.struct.briage.practice;

/**
 * @author Cauchy
 * @ClassName White.java
 * @Date 2019年12月1日
 * @Description 黑色
 * @Version
 */
public class Black implements Color {
    @Override
    public void print(Shape shape) {
        System.out.println("white" + shape);
    }

}
