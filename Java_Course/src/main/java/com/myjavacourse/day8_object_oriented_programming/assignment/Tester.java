package com.myjavacourse.day8_object_oriented_programming.assignment;

public class Tester extends Employee{
    double bonus;

    public Tester(int id, String name, double basedSalary, double bonus) {
        super(basedSalary, name, id);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basedSalary + bonus;
    }

    @Override
    public void displayEmpInfo() {
        super.displayEmpInfo();
    }
}
