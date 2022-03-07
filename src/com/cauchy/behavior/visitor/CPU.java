package com.cauchy.behavior.visitor;

/**
 * @author Cauchy
 * @ClassName CPU.java
 * @Date 2019年11月30日
 * @Description TODO
 * @Version
 */
public class CPU extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.visitCPU(this);

    }

    @Override
    double getPrice() {
        return 300;
    }

}
