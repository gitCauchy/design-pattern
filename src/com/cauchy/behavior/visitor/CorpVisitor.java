package com.cauchy.behavior.visitor;
/**
 * 
 * @author Cauchy
 * @ClassName CorpVisitor.java
 * @Date 2019��11��30��
 * @Description �����û�
 * @Version 
 *
 */
public class CorpVisitor implements Visitor{

	double totalPrice = 0.0;
	
	public void visitCPU(CPU cpu) {
		totalPrice += cpu.getPrice() * 0.8;
	}

	public void visitMemory(Memory memory) {
		totalPrice += memory.getPrice() * 0.8;
	}

	public void visitBoard(Board board) {
		totalPrice += board.getPrice() *0.8;
	}
}
