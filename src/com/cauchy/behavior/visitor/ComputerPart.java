package com.cauchy.behavior.visitor;

/**
 * @author Cauchy
 * @ClassName ComputerPart.java
 * @Date 2019年11月30日
 * @Description 电脑元件类
 * @Version
 */
public abstract class ComputerPart {
    abstract void accept(Visitor v);

    abstract double getPrice();
}
