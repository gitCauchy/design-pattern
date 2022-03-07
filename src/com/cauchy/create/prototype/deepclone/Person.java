package com.cauchy.create.prototype.deepclone;

/**
 * @author Cauchy
 * @ClassName Person.java
 * @Date 2019年11月29日
 * @Description 深克隆
 * @Version 1.0
 */
public class Person implements Cloneable {
    int age = 8;
    int score = 100;
    Location loc = new Location("bj", 22);

    @Override
    public Object clone() throws CloneNotSupportedException {
        /**
         * 实现深克隆，即对象里的引用对象也要实现Cloneable接口克隆。
         */
        Person p = (Person) super.clone();
        p.loc = (Location) loc.clone();
        return p;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.age + " " + p2.score);
        System.out.println(p2.loc);
        System.out.println(p1.loc == p2.loc);
        p1.loc.street = "sh";
        System.out.println(p2.loc);

    }
}
