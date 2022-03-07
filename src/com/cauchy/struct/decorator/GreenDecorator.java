package com.cauchy.struct.decorator;

/**
 * @author Cauchy
 * @ClassName GreenDecorator.java
 * @Date 2019年11月30日
 * @Description 绿色装饰器
 * @Version
 */
public class GreenDecorator extends Decorator {

    public GreenDecorator(Apple apple) {
        super(apple);
    }

    public void descB() {
        System.out.println("被装饰器扩展修饰");
    }

    @Override
    public void desc() {
        System.out.println("装饰成为绿色的");
        super.desc();
        System.out.println("装饰结束");
    }

}
