package com.myjavacourse.day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {
        // do first -> check validation

        int trainingModule = 5;

        System.out.println("Training Module");
        do {
//            trainingModule++;
            System.out.println("Completed module: " + trainingModule);
                trainingModule++;
        } while (trainingModule < 10);
            System.out.println("All required module has been completed");

        int employee = 1;
        System.out.println("Task 5: Payroll Processing");
        do {

            System.out.println("Processing payroll for employee " + employee);
                employee++;

        }while (employee < 4);
           System.out.println("Payroll processing completed for 3 employees");


    }


}
//Task 5: Payroll Processing
//Processing payroll for employee 1
//Processing payroll for employee 2
//Processing payroll for employee 3
//Payroll processing completed for 3 employees.