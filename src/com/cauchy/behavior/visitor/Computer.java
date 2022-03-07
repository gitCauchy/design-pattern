package com.cauchy.behavior.visitor;

/**
 * @author Cauchy
 * @ClassName Computer.java
 * @Date 2019年11月30日
 * @Description 电脑-有三部分组成 CPU-Memory-Board
 * @Version
 */
public class Computer {
    ComputerPart cup = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();
}
