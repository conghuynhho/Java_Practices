package com.java.thuchanh2;

abstract class Person {
    private String name;
    private int age;
    abstract void show();

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

class Employee extends Person {
    private float salary;

    @Override
    void show() {
        System.out.println("Show");
    }
}