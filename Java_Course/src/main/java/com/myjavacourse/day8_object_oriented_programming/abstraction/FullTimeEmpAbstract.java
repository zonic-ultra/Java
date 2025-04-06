package com.myjavacourse.day8_object_oriented_programming.abstraction;

public class FullTimeEmpAbstract extends EmployeeAbstraction{
    private double bonus;
    public FullTimeEmpAbstract(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}
