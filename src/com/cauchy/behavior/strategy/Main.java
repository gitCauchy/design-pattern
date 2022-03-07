package com.cauchy.behavior.strategy;

import java.util.Arrays;

/**
 * @author Cauchy
 * @ClassName Main.java
 * @Date 2019年11月30日
 * @Description 测试类
 * @Version
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(3, 3), new Cat(2, 2), new Cat(4, 4), new Cat(1, 1)};
        SorterByComparator s = new SorterByComparator();
        s.sort(cats, new CatCompareByWeight());
        System.out.println(Arrays.toString(cats));
    }
}
