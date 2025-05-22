package com.myjavacourse.final_assessment.model;

import java.util.Set;

public class Manager extends Employee{

    public Manager(int id, String firstName, String lastName, String department, int yearsOfService, double salary, Set<String> benefits, double bonus) {
        super(id, firstName, lastName, department, yearsOfService, salary, benefits, bonus);
    }

    @Override
    public double calculateTotalCompensation() {
        return getSalary() + getBonus() + (getYearsOfService() * 1000);
    }
}
