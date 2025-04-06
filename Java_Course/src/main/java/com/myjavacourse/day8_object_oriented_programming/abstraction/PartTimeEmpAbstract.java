package com.myjavacourse.day8_object_oriented_programming.abstraction;

public class PartTimeEmpAbstract extends EmployeeAbstraction{

    private double overTimePay;
    private int hoursWorked;

    public PartTimeEmpAbstract(int id, String name, double salary, double overTimePay, int hoursWorked) {
        super(id, name, salary);
        this.overTimePay = overTimePay;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return salary + (overTimePay * hoursWorked);
    }
}
