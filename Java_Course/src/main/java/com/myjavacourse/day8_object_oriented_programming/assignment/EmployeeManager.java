package com.myjavacourse.day8_object_oriented_programming.assignment;

public class EmployeeManager {
    public static void main(String[] args) {
        Tester t = new Tester(1,"Judens",40000.50,20000);
        Manager m = new Manager(2,"Zaida",20000.50, 0.20);
        Developer d = new Developer(3,"Este", 60000,500);
        Intern i = new Intern(4,"John", 5000.50,0.50);
        Encapsulation e = new Encapsulation(55,"Enca",10000);

        System.out.println("Manager");
        m.calculateSalary();
        m.displayEmpInfo();

        System.out.println();
        System.out.println("Developer");
        d.displayInfo();
        d.calculateSalary();
        System.out.println("Is attending: " + d.isAttending());
        System.out.println();
        System.out.println("Intern");
        i.displayInfo();
        i.calculateSalary();
        System.out.println();
        System.out.println("Encapsulation");
        System.out.println("Name: " +  e.getName());
        e.setName("Encanto");
        System.out.println("Updated Name: " +  e.getName());


    }
}
