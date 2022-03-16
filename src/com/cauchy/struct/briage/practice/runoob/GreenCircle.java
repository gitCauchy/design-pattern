package com.cauchy.struct.briage.practice.runoob;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color : green, radius: " + radius + ", x: " + x + " ,y: " + y);
    }
}
