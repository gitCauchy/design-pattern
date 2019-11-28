package com.cauchy.behavior.visitor;

public interface Visitor {
	void visitCPU(CPU cpu);
	void visitMemory(Memory memory);
	void visitBoard(Board board);
}
