package com.myjavacourse.day8_object_oriented_programming.inheritance;

public class EmployeeInheritance {
    private int id;
    private String name;
    private double salary;

    public EmployeeInheritance( int id, String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }
    public void displayEmpInfo(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("Total salary: " + calculateSalary());
    }
}
