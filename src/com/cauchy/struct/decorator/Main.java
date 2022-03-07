package com.cauchy.struct.decorator;

/**
 * @author Cauchy
 * @ClassName Main.java
 * @Date 2019年11月30日
 * @Description 测试类
 * @Version
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new ConcreteApple();
        System.out.println("------未装饰------");
        apple.desc();
        System.out.println("----------------");
        test(apple);
    }

    public static void test(Apple apple) {
        GreenDecorator decorator = new GreenDecorator(apple);
        System.out.println("------装饰后-------");
        decorator.desc();
        System.out.println("------------------");
    }
}
