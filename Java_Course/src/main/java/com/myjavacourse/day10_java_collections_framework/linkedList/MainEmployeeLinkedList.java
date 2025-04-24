package com.myjavacourse.day10_java_collections_framework.linkedList;

public class MainEmployeeLinkedList {
    public static void main(String[] args) {
        EmployeeServiceLinkedList emp = new EmployeeServiceLinkedList();

        System.out.println("Adding employee.......");
        emp.addEmployee(new EmployeeLinkedList(1,"Judens","BSIT"));
        emp.addEmployee(new EmployeeLinkedList(2,"Josh","ES"));
        emp.addEmployee(new EmployeeLinkedList(3,"Este","DevOps"));
        emp.addEmployee(new EmployeeLinkedList(5,"John","BSIT"));
        emp.getAllEmp();
        System.out.println("Add employee to last");
        emp.addEmployeeToLast(new EmployeeLinkedList(6,"Kent","AGRI"));
        emp.getAllEmp();
        System.out.println("Add emp to first");
        emp.addToFirstEmp(new EmployeeLinkedList(11,"Ling","Bio"));
        emp.getAllEmp();
        System.out.println("Add emp by index");
        emp.addEmployeeByIndex(2, new EmployeeLinkedList(22,"Joshua","BSIT"));
        emp.getAllEmp();

        System.out.println();
        System.out.println("GET");
        System.out.println("Last employee: " + emp.getLastEmployee());
        System.out.println("First employee: " + emp.getFirstEmployee());
        System.out.println("Get Este by index: " + emp.getLastEmployeeByIndex(2));
        System.out.println();
        System.out.println("Employee List");
        emp.getAllEmp();

        System.out.println();
        System.out.println("UPDATE");
        emp.updateEmployee(3, new EmployeeLinkedList(2,"June","Accountancy"));
        emp.getAllEmp();

        System.out.println("DELETE");
        emp.deleteEmp(5);
        emp.getAllEmp();

        System.out.println("GET TOTAL");
        System.out.println("Total: " + emp.getTotal());




    }
}
