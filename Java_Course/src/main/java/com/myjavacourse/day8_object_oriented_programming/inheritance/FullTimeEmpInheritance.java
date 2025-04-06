package com.myjavacourse.day8_object_oriented_programming.inheritance;

public class FullTimeEmpInheritance extends EmployeeInheritance {
    private double bonus;
//    private int hoursWorked;

    public FullTimeEmpInheritance( int id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displayEmpInfo() {
        super.displayEmpInfo();
        System.out.println("Bonus: Php" + bonus);
    }


}
