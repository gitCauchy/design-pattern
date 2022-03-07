package com.cauchy.struct.proxy.practice;

/**
 * 代理图像类
 *
 * @author Cauchy
 * @date 2022/03/07 21:03
 **/
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
