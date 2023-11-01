package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
// The name variable in the background is replaced by the new value that it is given
// The classes name variable is set to whatever name value it is given.  -John Chen
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
// The object already has a name and its just returning that name value
    public Integer getAge() {
        return age;
    }
}