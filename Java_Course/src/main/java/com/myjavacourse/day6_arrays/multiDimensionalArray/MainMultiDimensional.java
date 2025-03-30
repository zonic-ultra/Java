package com.myjavacourse.day6_arrays.multiDimensionalArray;

public class MainMultiDimensional {
    public static void main(String[] args) {
        Object[][] employeeData = {
                {"Judens", 50000, 9, true},
                {"John", 40000, 9, false},
                {"Este", 60000, 9, true},
        };
        displayEmployeeData(employeeData);

        Object[][] employeeData2 = {
                {"Judens", 50000.50, 11, true},
                {"John", 40000.50, 9, false},
                {"Este", 6000.50, 12, true},
        };
        displayEmployeeData(employeeData2);

        //10% raise to all employees > 10 yearsOfService
        System.out.println("Applying 10% raise to all employee");
        for (int i=0; i<employeeData2.length; i++){
            if ((int)employeeData2[i][2]>=10){
                double originalSalary = (double) employeeData2[i][1];
                employeeData2[i][1] = (double)employeeData2[i][1]*1.10;
                System.out.printf("%s raised to 10%%, Original salary: Php %.2f, New salary: Php %.2f %n,",
                        employeeData2[i][0],      originalSalary,           employeeData2[i][1]);
            }
            //%s -> string format
            //%2f -> double/float
            //%n -> new line
            //%d ->  int
        }
    }

    private static void displayEmployeeData(Object[][] employeeData) {
        for (Object[] employeesData: employeeData){
            System.out.println("Name: " + employeesData[0]);
            System.out.println("Salary: " + employeesData[1]);
            System.out.println("Working Hours: " + employeesData[2]);
            System.out.println("Is Late? : " + employeesData[3] + "\n");
        }
    }


}
