package com.zou.entity;

public class People {

    private int id;

    private String name;

    private int age;

    private Dog dog;


    public People() {
    }


    //构造方法注入需要的构造方法


    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public People(int id, String name, int age, Dog dog) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "id:   " + id + "name:    " + name + "age:    " + age + "dog: " + dog.getName();
    }
}
