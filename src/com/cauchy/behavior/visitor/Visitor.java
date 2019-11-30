package com.cauchy.behavior.visitor;
/**
 * 
 * @author Cauchy
 * @ClassName Visitor.java
 * @Date 2019Äê11ÔÂ30ÈÕ
 * @Description TODO
 * @Version 
 *
 */
public interface Visitor {
	void visitCPU(CPU cpu);
	void visitMemory(Memory memory);
	void visitBoard(Board board);
}
