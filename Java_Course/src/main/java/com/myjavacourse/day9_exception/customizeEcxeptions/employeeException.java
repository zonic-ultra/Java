package com.myjavacourse.day9_exception.customizeEcxeptions;

public class employeeException {
    private String name;
    private double salary;

    public employeeException(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) throws InvalidRaiseException {
        if (percentage < 0 || percentage > 100){
            throw new InvalidRaiseException("Invalid raise percentage. Must be between zero to 100 ");
        }
        this.salary += salary * (percentage/100);
    }
}
