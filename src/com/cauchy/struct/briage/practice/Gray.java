package com.cauchy.struct.briage.practice;

/**
 * @author Cauchy
 * @ClassName White.java
 * @Date 2019年12月1日
 * @Description 灰色
 * @Version
 */
public class Gray implements Color {
    @Override
    public void print(Shape shape) {
        System.out.println("gray " + shape);
    }

}
