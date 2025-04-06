package com.myjavacourse.day8_object_oriented_programming.polymorphism;

import com.myjavacourse.day8_object_oriented_programming.inheritance.EmployeeInheritance;

public class FullTimeEmpPolymorphism implements EmployeeInterface {
    private  int id;
    private String name;
    private double salary;
    private double bonus;

    public FullTimeEmpPolymorphism(int id, String name, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }



}
