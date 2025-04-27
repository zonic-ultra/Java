package com.myjavacourse.day10_java_collections_framework.hashSet;

public class MainArrayList {
    public static void main(String[] args) {
        EmpServiceHashSet employeeService = new EmpServiceHashSet();

        EmployeeHashSet emp1 = (new EmployeeHashSet("BSIT", "Judens",1));
        EmployeeHashSet emp2 =(new EmployeeHashSet("BCS", "Este",2));
        EmployeeHashSet emp3 =(new EmployeeHashSet("CRIM", "John",3));
        EmployeeHashSet emp4 =(new EmployeeHashSet("BSIT", "Zaida",4));
        EmployeeHashSet emp5 =(new EmployeeHashSet("BSIT", "Judens",1));

        //HashSet --- to prevent duplication
//        employeeService.getAllEmployees();

        System.out.println("...After adding.....");
        System.out.println("Added employee 1: "+ employeeService.addEmp(emp1));
        System.out.println("Added employee 2: "+ employeeService.addEmp(emp2));
        System.out.println("Added employee 3: "+ employeeService.addEmp(emp3));
        System.out.println("Added employee 4: "+ employeeService.addEmp(emp4));
        System.out.println("Added employee 5: "+ employeeService.addEmp(emp5));//duplicate of emp1
        System.out.println();
        employeeService.getAllEmployees();
        System.out.println();
        System.out.println("Total number of employees: " + employeeService.getTotalNumberOfEmployees());
        System.out.println();
        System.out.println("Checking if the employees is exits?");
        System.out.println("Contains employee 1: "+ employeeService.containsEmp(emp1));
        System.out.println("Contains employee 2: "+ employeeService.containsEmp(emp2));
        System.out.println("Contains employee 3: "+ employeeService.containsEmp(emp3));
        System.out.println("Contains employee 4: "+ employeeService.containsEmp(emp4));
        System.out.println("Contains employee 5: "+ employeeService.containsEmp(emp5));
        System.out.println();
        //remove employee
        System.out.println("Remove employee");
        System.out.println("Remove employee 3: "+ employeeService.removeEmp(emp2));
        System.out.println();
        System.out.println("Checking if the employees is exits?");
        System.out.println("Contains employee 1: "+ employeeService.containsEmp(emp1));
        System.out.println("Contains employee 2: "+ employeeService.containsEmp(emp2));//must be false
        System.out.println("Contains employee 3: "+ employeeService.containsEmp(emp3));
        System.out.println("Contains employee 4: "+ employeeService.containsEmp(emp4));
        System.out.println("Contains employee 5: "+ employeeService.containsEmp(emp5));
        System.out.println();
        System.out.println("Employee hash code");
        System.out.println("Hashcode of employee 1: "+ emp1.hashCode());
        System.out.println("Hashcode of employee 2: "+ emp2.hashCode());
        System.out.println("Hashcode of employee 3: "+ emp3.hashCode());
        System.out.println("Hashcode of employee 4: "+ emp4.hashCode());
        System.out.println("Hashcode of employee 5: "+ emp5.hashCode());


    }
}
