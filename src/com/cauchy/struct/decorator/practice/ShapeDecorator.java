package com.cauchy.struct.decorator.practice;

/**
 * 图形装饰类
 *
 * @author Cauchy
 * @date 2022/03/08 08:27
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

}
