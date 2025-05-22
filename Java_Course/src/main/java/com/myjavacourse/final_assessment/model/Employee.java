package com.myjavacourse.final_assessment.model;

import java.io.Serializable;
import java.util.Set;

public abstract class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private int yearsOfService;
   private double salary;
   private Set<String> benefits;
   private double bonus;

    public Employee(int id, String firstName, String lastName, String department, int yearsOfService, double salary, Set<String> benefits, double bonus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.yearsOfService = yearsOfService;
        this.salary = salary;
        this.benefits = benefits;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public double getSalary() {
        return salary;
    }

    public Set<String> getBenefits() {
        return benefits;
    }

    public double getBonus() {
        return bonus;
    }

    public abstract double calculateTotalCompensation();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", yearsOfService='" + yearsOfService + '\'' +
                ", salary=" + String.format("%.2f", salary)  +
                ", benefits=" + benefits +
                ", bonus=" + String.format("%.2f", bonus)  +
                ", Total Compensation =" + String.format("%.2f", calculateTotalCompensation())  +

                '}';
    }
}

