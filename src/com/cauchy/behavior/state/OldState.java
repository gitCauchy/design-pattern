package com.cauchy.behavior.state;

/**
 * @author Cauchy
 * @ClassName OldState.java
 * @Date 2019年11月30日
 * @Description 年老的表现
 * @Version
 */
public class OldState extends PersonState {
    @Override
    void eat() {
        System.out.println("eat little");
    }

    @Override
    void drink() {
        System.out.println("drink little");
    }

    @Override
    void sleep() {
        System.out.println("sleep little");
    }

}
