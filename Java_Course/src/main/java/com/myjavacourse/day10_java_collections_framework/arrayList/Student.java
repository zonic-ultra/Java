package com.myjavacourse.day10_java_collections_framework.arrayList;

public class Student {
    String name, course;

    Student(String name, String course){
        this.name = name;
        this.course = course;
    }
    void introduce(){
        System.out.println("Hi I'm " + name);
        System.out.println("From "+ course);
    }
}
