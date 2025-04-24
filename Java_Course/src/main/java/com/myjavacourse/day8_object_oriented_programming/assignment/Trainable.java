package com.myjavacourse.day8_object_oriented_programming.assignment;

public interface Trainable {
    String getName();
    int getId();
    boolean isAttending();
    double basedSalary();
    double calculateSalary();



    default void displayInfo(){
        System.out.println("Id : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Is attending: " + isAttending());
        System.out.printf("Based salary %.2f: " ,
                            basedSalary());
        System.out.println();
        System.out.println("Total salary : " + calculateSalary());
    }

}
