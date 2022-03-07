package com.cauchy.create.abstractfactory;

/**
 * @author Cauchy
 * @ClassName Sword.java
 * @Date 2019年11月29日
 * @Description 武器-剑
 * @Version
 */
public class Sword extends Weapon {
    @Override
    void kill() {
        System.out.println("kill by sword");
    }
}
