package com.cauchy.behavior.visitor;

/**
 * @author Cauchy
 * @ClassName Memory.java
 * @Date 2019��11��30��
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
