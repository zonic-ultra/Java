package com.myjavacourse.day8_object_oriented_programming.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        EmployeeInheritance regularEmployee = new EmployeeInheritance(101,"Judens",50000.75);
        FullTimeEmpInheritance fullTimeEmployee = new FullTimeEmpInheritance(101,"Este",50000.75,20000.75);
        PartTimeEmpInheritance partTimeEmployee = new PartTimeEmpInheritance(101,"John",50000.75, 1500, 4);

        System.out.println("Regular Employee");
        regularEmployee.displayEmpInfo();
        regularEmployee.calculateSalary();
        System.out.println();

        System.out.println("Full Time Employee");
        fullTimeEmployee.displayEmpInfo();
        fullTimeEmployee.calculateSalary();
        System.out.println();

        System.out.println("Part Time Employee");
        partTimeEmployee.displayEmpInfo();
        partTimeEmployee.calculateSalary();


    }

}
