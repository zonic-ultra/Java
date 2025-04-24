package com.myjavacourse.day9_exception.customizeEcxeptions;

public class MainCustomizedExceptions {
    public static void main(String[] args) {
        employeeException e = new employeeException("judens",50000.50);
        e.getName();

        try {
            e.raiseSalary(10);
            System.out.println("10% raise successful");
        }catch (InvalidRaiseException err){
            System.out.println("Caught the error" + err.getMessage());
        }finally {
            System.out.println("Salary processing is completed");
        }

    }
}
