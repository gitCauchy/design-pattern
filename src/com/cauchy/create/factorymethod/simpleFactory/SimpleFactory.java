package com.cauchy.create.factorymethod.simpleFactory;

/**
 * @author Cauchy
 * @ClassName SimpleFactory.java
 * @Date 2019年11月29日
 * @Description 简单工厂，工厂几种了所有实例的创建的逻辑，一旦工厂不能工作，整个系统都会受到影响
 * 增加新产品，工厂需要做修改。
 * @Version
 */
public class SimpleFactory {
    public static Product getProduct(String productName) {
        Product product = null;
        switch (productName) {
            case "car":
                product = new Car();
                break;
            case "plane":
                product = new Plane();
                break;
            default:
                break;
        }
        return product;
    }
}
