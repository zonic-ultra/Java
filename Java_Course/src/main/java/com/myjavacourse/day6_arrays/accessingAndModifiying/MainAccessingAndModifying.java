package com.myjavacourse.day6_arrays.accessingAndModifiying;

public class MainAccessingAndModifying {
    public static void main(String[] args) {
        double [] salary ={50000, 60000, 70000};
        int[] yearsOfService = {10,11,5};
        String[] employeeName = {"Judens", "John", "Este"};
        boolean[] isLate = {false, true, true};

        System.out.println("Employee Information \n");

        for (int y= 0; y < employeeName.length; y++){
            String names = employeeName[y];
            double basedSalary = salary[y];
            int years = yearsOfService[y];
            System.out.println("Name " + names);
            System.out.println("Salary " + basedSalary);
            System.out.println("Years " + years + "\n");
        }

        //10% raise to all employees > 10 yearsOfService
        System.out.println("Applying 10% raise to all employee");
        for (int i=0; i<employeeName.length; i++){
            if (yearsOfService[i]>=10){
                double originalSalary = salary[i];
                salary[i] *= 1.10;
                System.out.printf("%s raised to 10%%, Original salary: Php %.2f, New salary: Php %.2f %n,",
                                    employeeName[i],      originalSalary,           salary[i]);
            }
        }

        //10% deduction to all employees who are late
        System.out.println("Applying 10% deduction to all employee who is late");
        for (int i=0; i<employeeName.length; i++){
            if (isLate[i]){
                double originalSalary = salary[i];
                salary[i] -= 1.10;
                System.out.printf("%s deducted to 10%%, Original salary: Php %.2f, New salary: Php %.2f %n,",
                        employeeName[i],      originalSalary,           salary[i]);
            }
        }

    }
}
