package com.myjavacourse.day10_java_collections_framework.treeMap;


import java.util.TreeMap;

public class MainTreeMap {
    public static void main(String[] args) {
        EmployeeServiceTreeMap employeeServiceTreeMap = new EmployeeServiceTreeMap();

        employeeServiceTreeMap.addEmployee(new EmployeeTreeMap(5,"Zaida","DevTac"));
        employeeServiceTreeMap.addEmployee(new EmployeeTreeMap(6,"John","BSIT"));
        employeeServiceTreeMap.addEmployee(new EmployeeTreeMap(7,"Ling","Es"));
        employeeServiceTreeMap.addEmployee(new EmployeeTreeMap(4,"Este","BSIT"));
        employeeServiceTreeMap.addEmployee(new EmployeeTreeMap(2,"Zitzuna","Unk"));
        employeeServiceTreeMap.addEmployee(new EmployeeTreeMap(1,"Judens","DevOps"));
        employeeServiceTreeMap.addEmployee(new EmployeeTreeMap(1,"Judens","DevTac"));
        System.out.println(".......After adding......");
        employeeServiceTreeMap.displayAllEmployees();
        System.out.println();

        System.out.println("......Get first employee.....");
        System.out.println(employeeServiceTreeMap.getFirstEmployee());
        System.out.println();
        System.out.println("......Get last employee.....");
        System.out.println(employeeServiceTreeMap.getLastEmployee());

        int id = 2;
        System.out.println("....Get employee id: " + id);
        System.out.println(employeeServiceTreeMap.getEmployeeByID(id));
        System.out.println();

        System.out.println(".......Remove employee by id.......");
        int removeById = 2;
        System.out.println("Remove employee id: "+ removeById + employeeServiceTreeMap.removeEmployeeByIdTreeMap(removeById));
        employeeServiceTreeMap.displayAllEmployees();
        System.out.println();

        System.out.println("...Get total of employees......");
        System.out.println("total number of employees: " + employeeServiceTreeMap.getTotal());
        System.out.println();

        System.out.println(".....Check if exist.....");
        int employeeId = 5;
        System.out.println("Is employee id: "+ employeeId + " exist ? " + employeeServiceTreeMap.hasEmployee(employeeId));
        System.out.println();
        System.out.println("....Update employee by id.....");
        int updateEmpById = 7;
        employeeServiceTreeMap.updateEmployee(updateEmpById,"Ling Long","ES");
        employeeServiceTreeMap.displayAllEmployees();




    }
}
