package com.myjavacourse.day10_java_collections_framework.arrayList;

import java.util.ArrayList;

public class EmployeeServiceArrayList {
    private ArrayList<EmployeeArrayList> employeeLists;

    public EmployeeServiceArrayList() {
        this.employeeLists = new ArrayList<>();
    }
    //CRUD

    public EmployeeArrayList getFirstEmployee() {
        return employeeLists.getFirst();
    }

    public EmployeeArrayList getLastEmployee() {
        return employeeLists.getLast();
    }
    public EmployeeArrayList getIndexEmployee(int index) {
        return employeeLists.get(index);
    }
//    public EmployeeArrayList getLasEmployee() {
//        return employeeLists.getClass();
//    }
    public void addEmployee(EmployeeArrayList addEmployeeList){
        employeeLists.add(addEmployeeList);
    }
    public void addEmployeeByIndex(int index, EmployeeArrayList addEmployeeByIndex){
        employeeLists.add(index,addEmployeeByIndex);
    }
    public void addEmployeeByFirst(EmployeeArrayList addEmployeeByFirst){
        employeeLists.addFirst(addEmployeeByFirst);
    }
    public void addEmployeeLast(EmployeeArrayList addEmployeeLast){
        employeeLists.addLast(addEmployeeLast);
    }
//update
    public void updateEmployee(int index, EmployeeArrayList updateEmployee ){
        employeeLists.set(index, updateEmployee);
    }
    //remove
    public EmployeeArrayList removeByIndexEmployee(int employeeId){
        return employeeLists.remove(employeeId);
    }
    //total
    public int getTotal(){
        return employeeLists.size();
    }
    //Empty?
    public  boolean isEmpty(){
        return employeeLists.isEmpty();
    }

    public void printAllEmployees(){
        for (EmployeeArrayList emp: employeeLists){
            System.out.println("- " + emp);
        }
    }


}
