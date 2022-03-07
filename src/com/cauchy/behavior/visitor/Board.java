package com.cauchy.behavior.visitor;

/**
 * @author Cauchy
 * @ClassName Board.java
 * @Date 2019年11月30日
 * @Description 主板
 * @Version
 */
public class Board extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 300;
    }


}
