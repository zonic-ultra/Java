package com.myjavacourse.day6_arrays.May_Answer_For_The_Assignment_Day5and6;

public class EmployeeManagementSystem {
    public static void main(String[] args){

        String department1 = "IT Department";
        String name1 = "Judens Bandal";
        int age1 = 22;
        double salary1 = 350000;

        String department2 = "ES Department";
        String name2 = "John Durante";
        int age2 = 67;
        double salary2 = 550000;

        String department3 = "Bio Department";
        String name3 = "Este Banagbanag";
        int age3 = 73;
        double salary3 = 50000;


//        Instructions
//        1. (if-else statements): Checks retirement eligibility based on the employee's age.
        System.out.println("Task 1: Retirement Eligibility Check");
        System.out.println("Retirement Check");

        if (age1 >=65 ){
            System.out.println(name1 + " is eligible retirement");
        }else {
            System.out.println(name1 + " is not eligible retirement");
        }
        if (age2 >=65 ){
            System.out.println(name2 + " is eligible retirement");
        }else {
            System.out.println(name2 + " is not eligible retirement");
        }
        if (age3 >=65 ){
            System.out.println(name3 + " is eligible retirement");
        }else {
            System.out.println(name3 + " is not eligible retirement");
        }

//        2. (switch statements): Provides information about different departments.
        System.out.println("\nTask 2: Department Information");
        String dept = "Bio";
        switch (dept.toLowerCase()){
            case "it":
                System.out.println(department1 + ": encompasses the use of computer systems, software, networks, and other electronic devices to store, retrieve, transmit, and manipulate data, forming the foundation of our digital infrastructure.");
                break;
            case "es":
                System.out.println(department2 + ": is an interdisciplinary field that uses scientific methods to understand and address environmental challenges, integrating disciplines like Earth sciences, life sciences, and physical sciences");
                break;
            case "bio":
                System.out.println(department3 + ": the scientific study of life and living organisms, encompassing diverse fields like botany, ecology, genetics, and evolution, aiming to understand their structure, function, growth, and evolution. ");
                break;
            default:
                System.out.println("Unknown Department: " + dept);

        }

//        3. (for loop): Projects an employee's salary over a specified number of years.
//        double salary = 1837500.00;
        double incrementRate = 0.05; // 5% increment per year

        System.out.println("\nTask 3: Salary Increment" + " Projected salary for "  +  name1 + " over 5 years:");
        for (int year = 1; year<=5; year++){
            System.out.printf("Year %d: Php %.2f%n",
                                year,    salary1);
            salary1 += salary1 * incrementRate;
        }
//        4.  (while loop): Validates the last 4 digits of an employee's ID.


//        5.  (do-while loop): Simulates a payroll processing system.

        int employee = 1;

        System.out.println("\nTask 5: Payroll Processing");
        do {
            System.out.println("Processing payroll for employee " + employee);
            employee++;
        }while (employee < 4);
            System.out.println("Payroll processing completed for 3 employees.");

    }
}
