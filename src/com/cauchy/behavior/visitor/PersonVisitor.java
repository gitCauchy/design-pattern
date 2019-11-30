package com.cauchy.behavior.visitor;
/**
 * 
 * @author Cauchy
 * @ClassName PersonVisitor.java
 * @Date 2019年11月30日
 * @Description 个人用户
 * @Version 
 *
 */
public class PersonVisitor implements Visitor{

	double totalPrice = 0.0;
	
	public void visitCPU(CPU cpu) {
		totalPrice += cpu.getPrice() * 0.9;
	}

	public void visitMemory(Memory memory) {
		totalPrice += memory.getPrice() * 0.9;
	}

	public void visitBoard(Board board) {
		totalPrice += board.getPrice() *0.9;
		
	}

	

}
