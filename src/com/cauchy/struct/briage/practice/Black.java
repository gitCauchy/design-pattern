package com.cauchy.struct.briage.practice;

/**
 * @author Cauchy
 * @ClassName White.java
 * @Date 2019��12��1��
 * @Description ��ɫ
 * @Version
 */
public class Black implements Color {
    @Override
    public void print(Shape shape) {
        System.out.println("white" + shape);
    }

}
