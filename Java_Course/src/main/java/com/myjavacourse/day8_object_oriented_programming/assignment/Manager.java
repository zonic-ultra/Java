package com.myjavacourse.day8_object_oriented_programming.assignment;

public class Manager extends Employee {
    double bonus;

    public Manager(int id, String name, double basedSalary, double bonus) {
        super(basedSalary, name, id);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basedSalary + (basedSalary * bonus);
    }

    @Override
    public void displayEmpInfo() {
        super.displayEmpInfo();
        System.out.printf("Bonus %.2f%%",
                                        bonus);
        System.out.println();

    }
}
