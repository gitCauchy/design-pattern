package com.cauchy.create.builder.practice;
/**
 *
 * @author Cauchy
 * @ClassName Location.java
 * @Date 2019年11月29日
 * @Description Builder模式练习-Location类
 * @Version
 *
 */
public class Location {
    /*
     * 街区
     */
    String street;
    /*
     * 号码
     */
    int number;

    public String toString() {
        return "Location [street=" + street + ", number=" + number + "]";
    }
}
