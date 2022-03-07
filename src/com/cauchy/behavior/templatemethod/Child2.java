package com.cauchy.behavior.templatemethod;

/**
 * @author Cauchy
 * @ClassName Child2.java
 * @Date 2019年11月30日
 * @Description 第二种实现
 * @Version
 */
public class Child2 extends Father {
    @Override
    void op1() {
        System.out.println("c2.op1");
    }

    @Override
    void op2() {
        System.out.println("c2.op2");
    }

}
