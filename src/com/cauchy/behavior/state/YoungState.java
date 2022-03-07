package com.cauchy.behavior.state;

/**
 * @author Cauchy
 * @ClassName YoungState.java
 * @Date 2019年11月30日
 * @Description 年轻状态的表现
 * @Version
 */
public class YoungState extends PersonState {
    @Override
    void eat() {
        System.out.println("eat much");
    }

    @Override
    void drink() {
        System.out.println("drink much");
    }

    @Override
    void sleep() {
        System.out.println("sleep much");
    }
}
