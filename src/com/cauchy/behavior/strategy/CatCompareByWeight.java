package com.cauchy.behavior.strategy;

/**
 * @author Cauchy
 * @ClassName CatCompareByWeight.java
 * @Date 2019��11��30��
 * @Description ͨ���Ƚ�è���������Ƚ�è�Ĵ�С
 * @Version
 */
public class CatCompareByWeight implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.weight < c2.weight) {
            return -1;
        } else if (c1.weight > c2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
