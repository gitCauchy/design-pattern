package com.cauchy.create.abstractfactory;

/**
 * @author Cauchy
 * @ClassName Gun.java
 * @Date 2019年11月29日
 * @Description 武器-枪
 * @Version
 */
public class Gun extends Weapon {

    @Override
    void kill() {
        System.out.println("kill by shot");
    }
}
