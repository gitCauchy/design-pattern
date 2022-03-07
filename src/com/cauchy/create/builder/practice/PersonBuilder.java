package com.cauchy.create.builder.practice;

public class PersonBuilder {
    Person person = new Person();

    public PersonBuilder basicInfo(String name,int age,int sex) {
        person.name = name;
        person.age = age;
        person.sex = sex;
        return this;
    }

    public PersonBuilder healthInfo(float weight,float height) {
        person.weight = weight;
        person.height = height;
        return this;
    }

    public PersonBuilder addressInfo(String street,int number) {
        Location location = new Location();
        location.street = street;
        location.number = number;
        person.loc = location;
        return this;
    }

    public Person builder() {
        return person;
    }


}
