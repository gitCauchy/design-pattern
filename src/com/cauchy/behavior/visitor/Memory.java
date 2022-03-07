package com.cauchy.behavior.visitor;

/**
 * @author Cauchy
 * @ClassName Memory.java
 * @Date 2019Äê11ÔÂ30ÈÕ
 * @Description TODO
 * @Version
 */
public class Memory extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.visitMemory(this);

    }

    @Override
    double getPrice() {
        return 300;
    }

}
