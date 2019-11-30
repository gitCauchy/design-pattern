package com.cauchy.behavior.visitor;
/**
 * 
 * @author Cauchy
 * @ClassName ComputerPart.java
 * @Date 2019��11��30��
 * @Description ����Ԫ����
 * @Version 
 *
 */
public abstract class ComputerPart {
	abstract void accept(Visitor v);
	abstract double getPrice();
}
