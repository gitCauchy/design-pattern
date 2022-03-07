package com.cauchy.struct.briage.practice;

/**
 * @author Cauchy
 * @ClassName Client.java
 * @Date 2019年12月1日
 * @Description 测试类
 * @Version
 */
public class Client {
    public static void main(String[] args) {
        Shape square = new Square(new White());
        square.draw();
    }
}
