package com.myjavacourse.day8_object_oriented_programming.polymorphism;

public interface EmployeeInterface {
    int getId();
    String getName();
    double salary();
    double calculateSalary();

    default void displayEmpInfo(){
        System.out.println("Id : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + salary());
        System.out.println("Total salary: " + calculateSalary());
    }
}
