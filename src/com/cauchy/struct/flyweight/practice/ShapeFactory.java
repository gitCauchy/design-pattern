package com.cauchy.struct.flyweight.practice;

import java.util.HashMap;

/**
 * 图形工厂类
 *
 * @author Cauchy
 * @date 2022/03/07 20:29
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
