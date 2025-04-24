package com.myjavacourse.day8_object_oriented_programming.assignment;

public class Encapsulation {

    private int id;
    private String name;
    private double salary;

    public Encapsulation(int id, String name,double salary) {
        this.salary = salary;
        this.name = name;
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
