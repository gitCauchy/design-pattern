package com.cauchy.behavior.momento;

/**
 * @author Cauchy
 * @ClassName PeopleMemento.java
 * @Date 2019年12月1日
 * @Description 保存对象的状态
 * @Version
 */
public class PeopleMemento {
    private String name;
    private int age;

    public PeopleMemento(People people) {
        this.name = people.getName();
        this.age = people.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
