package com.myjavacourse.day8_object_oriented_programming.inheritance.inheritance01;

public class subClass extends superClass{

    String talent1;

    subClass(String name,String surname, String sex, int age, String talent1) {
        super(name,surname, sex, age);
        this.talent1 = talent1;
    }


    void talent(){
        System.out.println("Dancing");
    }

    void checkStatus(){
        super.checkStatus();
        System.out.println("Talent: " + talent1);
    }

}
