package com.cauchy.struct.decorator.practice;

/**
 * 红色图形装饰类
 *
 * @author Cauchy
 * @date 2022/03/08 08:34
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Corlor: Red");
    }
}
