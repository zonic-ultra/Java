package com.myjavacourse.day8_object_oriented_programming.assignment;

abstract class Employee {
    private int id;
    private String name;
    protected double basedSalary;


    public Employee(double basedSalary, String name, int id) {
        this.basedSalary = basedSalary;
        this.name = name;
        this.id = id;
    }

    public  abstract double calculateSalary();

    public void displayEmpInfo(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.printf("Salary %.2f: " ,
                         basedSalary);
        System.out.println();
        System.out.println("Total salary: " + calculateSalary());
    }


}
