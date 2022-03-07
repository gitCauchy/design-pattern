package com.cauchy.struct.decorator;

/**
 * @author Cauchy
 * @ClassName RedDecorator.java
 * @Date 2019年11月30日
 * @Description 红色装饰器
 * @Version
 */
public class RedDecorator extends Decorator {

    public RedDecorator(Apple apple) {
        super(apple);
    }

    public void descA() {
        System.out.println("被装饰器扩展修饰");
    }

    @Override
    public void desc() {
        System.out.println("装饰成为红色的");
        super.desc();
        System.out.println("装饰器装饰结束");
    }

}
