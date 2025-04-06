package com.myjavacourse.day8_object_oriented_programming.inheritance.inheritance01;

public class kidClass extends subClass{
    int gradeLevel;

    kidClass(String name,String surname, String sex, int age, String talent1, int gradeLevel) {
        super(name,surname, sex, age, talent1);
        this.gradeLevel = gradeLevel;

    }

    void checkStatus(){
        super.checkStatus();
        System.out.println("Grade Level: " + gradeLevel);
    }
}
