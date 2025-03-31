package com.myjavacourse.day4_operators.My_Answer_For_The_Assginment;

public class EmployeeManagementSystem1 {
    public static void main(String[] args){
//        Name (String)
//        Age (int)
//        Employee ID (long)
//        Department (String)
//        Salary (double)
//        IsReadyForRetire (boolean)

        String department1 = "IT Department";
        String name1 = "Judens Bandal";
        int age1 = 22;
        long employeeID1 = 21242421;
        double salary1 = 350000;
        boolean isReadyForRetire1 = false;

        String name2 = "John Durante";
        int age2 = 67;
        long employeeID2 = 21242422;
        double salary2 = 550000;
        boolean isReadyForRetire2 = true;


        String department2 = "ES Department";
        String name3 = "Este Banagbanag";
        int age3 = 73;
        long employeeID3 = 21242423;
        double salary3 = 50000;
        boolean isReadyForRetire3 = true;

        String name4 = "Zaida Zin";
        int age4 = 50;
        long employeeID4 = 21242424;
        double salary4 = 40000;
        boolean isReadyForRetire4 = false;


//        Instructions
//        1. Check if any of the employees are eligible for
//        retirement (assume retirement age is 65). //can use Ternary Operator
        String isReadyForRetirement1 = isReadyForRetire1 && age1 >= 65 ? " is eligible for retirement": " is not eligible for retirement";
        System.out.println(name1 + isReadyForRetirement1);

        String isReadyForRetirement2 = isReadyForRetire2 && age2 >= 65 ? " is eligible for retirement": " is not eligible for retirement";
        System.out.println(name2 + isReadyForRetirement2);

        String isReadyForRetirement3 = isReadyForRetire3 && age3 >= 65 ? " is eligible for retirement": " is not eligible for retirement";
        System.out.println(name3 + isReadyForRetirement3);

        String isReadyForRetirement4 = isReadyForRetire4 && age4 >= 65 ? " is eligible for retirement": " is not eligible for retirement";
        System.out.println(name4 + isReadyForRetirement4);
        System.out.println();

//        2. Calculate the average salary per department
        double averageSalaryPerDepartment1 = (salary1 + salary2)/2;
        System.out.println("Average Salary of "+ department1+ " : " + averageSalaryPerDepartment1);

        double averageSalaryPerDepartment2 = (salary3 + salary4) /2;
        System.out.println("Average Salary of "+ department2+ " : " + averageSalaryPerDepartment2 + "\n");


//        3. Calculate the average age of the employees
        int averageAgeOfAllDepartment= (age1 + age2 + age3 + age4) /4;
        System.out.println("Average Age of "+ department1+ " and "+ department2+ " : " + averageAgeOfAllDepartment+"\n");
//        int averageAgePerDepartment2 = age3 + age4 /2;
//        System.out.println("Average Age of "+ department2+ " : " + averageAgePerDepartment2 + "\n");

//        4. Give 5% raise for all employees except for a salary of 50k php and above
        System.out.println("BEFORE\n"+department1);
        System.out.println(name1 + ": " + salary1);
        System.out.println(name2 + ": " + salary2 + "\n");

        System.out.println(department2);
        System.out.println(name3 + ": " + salary3);
        System.out.println(name4 + ": " + salary4 + "\n");

        System.out.println("AFTER\n"+department1);
        if (salary1 < 50000)
            salary1*=1.05;
            System.out.println(name1 + ": " + salary1);

        if (salary2 < 50000)
            salary2*=1.05;
            System.out.println( name2 + ": " + salary2 + "\n");

        System.out.println(department2);

        if (salary3 < 50000)
            salary3*=1.05;
        System.out.println(name3 + ": " + salary3);

        if (salary4 < 50000)
            salary4*=1.05;
        System.out.println( name4 + ": " + salary4);

    }
}
