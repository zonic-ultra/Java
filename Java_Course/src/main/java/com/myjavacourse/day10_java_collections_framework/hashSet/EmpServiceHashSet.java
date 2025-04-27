package com.myjavacourse.day10_java_collections_framework.hashSet;

import java.util.HashSet;

public class EmpServiceHashSet {
    private HashSet<EmployeeHashSet> employeeHashSets;

    public EmpServiceHashSet() {
        employeeHashSets = new HashSet<>();
    }
    //add
    public boolean addEmp(EmployeeHashSet addEmp){
        return employeeHashSets.add(addEmp);
    }
    //remove
    public boolean removeEmp(EmployeeHashSet removeEmp){
        return employeeHashSets.remove(removeEmp);
    }
    //validate if the object is existing or contains
    public boolean containsEmp(EmployeeHashSet containsEmp){
        return employeeHashSets.contains(containsEmp);
    }
    public void getAllEmployees(){
        System.out.println("Current Employees");
        for(EmployeeHashSet emp: employeeHashSets){
            System.out.println("-" + emp);
        }
    }

    public int getTotalNumberOfEmployees(){
        return employeeHashSets.size();
    }

}
