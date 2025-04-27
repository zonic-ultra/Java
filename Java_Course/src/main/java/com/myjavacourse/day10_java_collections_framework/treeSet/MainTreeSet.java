package com.myjavacourse.day10_java_collections_framework.treeSet;

import java.util.Comparator;

public class MainTreeSet {
    public static void main(String[] args) {
        EmployeeServiceTreeSet employeeById = new EmployeeServiceTreeSet();
        //sorting default is the id

        employeeById.addEmpObject (new EmployeeTreeSet("BSIT", "Judens",1));
        employeeById.addEmpObject(new EmployeeTreeSet("BCS", "Este",2));
        employeeById.addEmpObject(new EmployeeTreeSet("CRIM", "John",3));
        employeeById.addEmpObject(new EmployeeTreeSet("BSIT", "Zaida",4));
        employeeById.addEmpObject(new EmployeeTreeSet("BSIT", "Judens",1));

        //To make it sorted
        System.out.println("Current Employee List");
        employeeById.printAllEmployees();
        System.out.println();
        System.out.println("Get first employee: "+employeeById.getFirstEmp());
        System.out.println("Get last employee: "+employeeById.getLastEmp());
        
        //comparator

        System.out.println("Sort by Name");
        EmployeeServiceTreeSet employeeByName = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getName)
        );
        employeeByName.addEmpObject (new EmployeeTreeSet("BSIT", "Judens",1));
        employeeByName.addEmpObject(new EmployeeTreeSet("BCS", "Este",2));
        employeeByName.addEmpObject(new EmployeeTreeSet("CRIM", "John",3));
        employeeByName.addEmpObject(new EmployeeTreeSet("BSIT", "Zaida",4));
        employeeByName.addEmpObject(new EmployeeTreeSet("BSIT", "Judens",1));
        employeeByName.printAllEmployees();

        System.out.println("Sort by department");
        EmployeeServiceTreeSet employeeByDept = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getDepartment)
        );
        employeeByDept.addEmpObject (new EmployeeTreeSet("BSIT", "Judens",1));
        employeeByDept.addEmpObject(new EmployeeTreeSet("BCS", "Este",2));
        employeeByDept.addEmpObject(new EmployeeTreeSet("CRIM", "John",3));
        employeeByDept.addEmpObject(new EmployeeTreeSet("HM", "Zaida",4));
        employeeByDept.addEmpObject(new EmployeeTreeSet("BSIT", "Judens",1));
        employeeByDept.printAllEmployees();



    }
}
