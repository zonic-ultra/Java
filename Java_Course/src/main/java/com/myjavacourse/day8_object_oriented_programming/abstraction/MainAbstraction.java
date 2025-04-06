package com.myjavacourse.day8_object_oriented_programming.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {
        Animal d = new dog();
        Animal c = new cat();
        FullTimeEmpAbstract fullTimeEmp = new FullTimeEmpAbstract(101,"Este",50000.75,20000.75);
        PartTimeEmpAbstract partTimeEmp = new PartTimeEmpAbstract(102,"Zaida",50000.75,20000,4);

        System.out.println("Full time employee");
        fullTimeEmp.displayEmpInfo();
        System.out.println();
        System.out.println("Part time employee");
        partTimeEmp.displayEmpInfo();



        d.setName("Maxx");
        c.setName("Meoweh");


        d.makeSound();
        c.makeSound();

        d.showName();
        c.showName();
    }
}
