package com.cauchy.behavior.visitor;

/**
 * @author Cauchy
 * @ClassName Visitor.java
 * @Date 2019年11月30日
 * @Description
 * @Version
 */
public interface Visitor {
    void visitCPU(CPU cpu);

    void visitMemory(Memory memory);

    void visitBoard(Board board);
}
