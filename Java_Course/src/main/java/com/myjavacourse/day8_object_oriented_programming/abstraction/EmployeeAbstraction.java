package com.myjavacourse.day8_object_oriented_programming.abstraction;

public abstract class EmployeeAbstraction {
    private int id;
    private String name;
    protected double salary;

    public EmployeeAbstraction( int id,String name, double salary) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public  abstract double calculateSalary();

    public void displayEmpInfo(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("Total salary: " + calculateSalary());
    }
}
