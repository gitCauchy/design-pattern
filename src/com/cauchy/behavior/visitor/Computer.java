package com.cauchy.behavior.visitor;
/**
 * 
 * @author Cauchy
 * @ClassName Computer.java
 * @Date 2019��11��30��
 * @Description ����-����������� CPU-Memory-Board
 * @Version 
 *
 */
public class Computer {
	ComputerPart cup = new CPU();
	ComputerPart memory = new Memory();
	ComputerPart board = new Board();
}
