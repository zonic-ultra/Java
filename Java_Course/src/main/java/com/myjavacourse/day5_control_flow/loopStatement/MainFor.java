package com.myjavacourse.day5_control_flow.loopStatement;

public class MainFor {
    public static void main(String[] args) {
        double [] salary ={50000, 60000, 70000};
        int[] yearsOfService = {6,3,5};
        String[] employeeName = {"Judens", "John", "Este"};

        System.out.println("Employee Information \n");

        for (int y= 0; y < employeeName.length; y++){
            String names = employeeName[y];
            double basedSalary = salary[y];
            int years = yearsOfService[y];
            System.out.println("Name " + names);
            System.out.println("Salary " + basedSalary);
            System.out.println("Years " + years + "\n");
        }
    }
}
