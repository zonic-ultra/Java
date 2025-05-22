package com.myjavacourse.day10_java_collections_framework.hashMap;

public class MainHashMap {
    public static void main(String[] args) {
        EmployeeServiceHashMap employeeService = new EmployeeServiceHashMap();

        employeeService.addEmployee(new EmployeeHashMap(1,"Judens","BSIT"));
        employeeService.addEmployee(new EmployeeHashMap(3,"Este","BSIT"));
        employeeService.addEmployee(new EmployeeHashMap(5,"John","BSIT"));
        employeeService.addEmployee(new EmployeeHashMap(4,"Zaida","ES"));
        employeeService.addEmployee(new EmployeeHashMap(2,"David","BCS"));
        employeeService.addEmployee(new EmployeeHashMap(1,"Judens","BSIT"));

        System.out.println("After adding......");
        employeeService.displayAllEmployees();

        System.out.println("............Get employee by id............");
        int searchID = 2;
        System.out.println("Get employee id: " + searchID);
        System.out.println(employeeService.getEmployeeById(searchID));


        //update
        System.out.println("........Update Employee by id......");
        employeeService.updateEmployee(1,"Judens Bandal","DevOps");
        employeeService.displayAllEmployees();
        System.out.println();

        System.out.println("Total: " + employeeService.getTotal());
        System.out.println();

        //remove
        System.out.println(".............Remove Employee id #2");
        int removeById = 2;
        System.out.println("Remove employee id: "+removeById + employeeService.removeEmployeeById(removeById));
//        employeeService.removeEmployeeById(2);
        employeeService.displayAllEmployees();

        System.out.println();
        //check if employee contains
        System.out.println("..........check if employee contains........");
        int checkId = 2;
        System.out.println("Does employee id: "+ checkId + " exist ? "+ employeeService.hasEmployee(checkId));





    }

}
