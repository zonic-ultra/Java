package com.myjavacourse.day8_object_oriented_programming.inheritance;

public class PartTimeEmpInheritance extends EmployeeInheritance {
    private double overTimePay;
    private int hoursWorked;

    public PartTimeEmpInheritance(int id, String name, double salary, double overTimePay, int hoursWorked) {
        super(id, name, salary);
        this.overTimePay = overTimePay;
        this.hoursWorked= hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (overTimePay * hoursWorked);
    }

    @Override
    public void displayEmpInfo() {
        super.displayEmpInfo();
        System.out.println("Over time pay: Php" + overTimePay);
        System.out.println("Hours worked:  " + hoursWorked);
    }


}
