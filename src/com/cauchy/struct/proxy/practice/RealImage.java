package com.cauchy.struct.proxy.practice;

/**
 * 真正的图像
 *
 * @author Cauchy
 * @date 2022/03/07 20:58
 **/
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying" + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
