package com.myjavacourse.day8_object_oriented_programming.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        FullTimeEmpPolymorphism fullTimeEmp = new FullTimeEmpPolymorphism(450,"Odent",50000.75,20000);
        PartTimeEmpPolymorphism partTimeEmp = new PartTimeEmpPolymorphism(451, "Este", 30000,1500, 4);
        System.out.println("Full time employee");
        fullTimeEmp.displayEmpInfo();
        System.out.println();

        System.out.println("Part time employee");
        partTimeEmp.displayEmpInfo();

    }
}
