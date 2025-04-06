package com.myjavacourse.day8_object_oriented_programming.inheritance.inheritance01;

public class superClass extends MainInheritance {
    String name ,surname, sex;
    int age;

    void checkStatus(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }

    void characteristic(){
        System.out.println("Handsome");
    }

    superClass(String name, String surname, String sex, int age){
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;

    }
}
