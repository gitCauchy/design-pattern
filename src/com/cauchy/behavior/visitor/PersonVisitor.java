package com.cauchy.behavior.visitor;

public class PersonVisitor implements Visitor{

	double totalPrice = 0.0;
	@Override
	public void visitCPU(CPU cpu) {
		totalPrice += cpu.getPrice() * 0.9;
		
	}

	@Override
	public void visitMemory(Memory memory) {
		totalPrice += memory.getPrice() * 0.9;
		
	}

	@Override
	public void visitBoard(Board board) {
		totalPrice += board.getPrice() *0.9;
		
	}

	

}
