package com.myjavacourse.day8_object_oriented_programming.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        EmployeeEncapsulation employee = new EmployeeEncapsulation(404, "Judens",50000.75);
        System.out.println("Name: " + employee.getName());
        System.out.println("Id: " + employee.getId());
        System.out.println("Salary: " + employee.getSalary());

        System.out.println();
        employee.setName("Judens Bandal");
        employee.setId(4054);
        System.out.println("Name: " + employee.getName());
        System.out.println("Id: " + employee.getId());
        System.out.println();
        employee.setSalary(60000.75);
        System.out.println("Salary: " + employee.getSalary());

        employee.setSalary(-6007700.75);
        System.out.println("Updated salary: " + employee.getSalary());
        employee.salaryIncreasePercentage(-10);
        System.out.println("Salary Increase");


    }

}
