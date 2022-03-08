package com.cauchy.struct.decorator;

/**
 * @author Cauchy
 * @ClassName ConcreteApple.java
 * @Date 2019年11月30日
 * @Description 实际的苹果
 * @Version
 */
public class ConcreteApple implements Apple {
    @Override
    public void desc() {
        System.out.println("普通的苹果");
    }

}
