package com.cauchy.create.singleton;

/**
 * @author Cauchy
 * @ClassName Singleton07.java
 * @Date 2019年11月29日
 * @Description 枚举类实现
 * @Version
 */
public enum Singleton07 {
    INSTANCE;

    public Singleton07 getInstance() {
        return INSTANCE;
    }
}
