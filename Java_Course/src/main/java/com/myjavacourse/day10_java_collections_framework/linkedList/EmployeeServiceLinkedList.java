package com.myjavacourse.day10_java_collections_framework.linkedList;

import java.util.LinkedList;

public class EmployeeServiceLinkedList {
    private LinkedList<EmployeeLinkedList> employeeLinkedLists;

    public  EmployeeServiceLinkedList(){
        employeeLinkedLists = new LinkedList<>();
    }
    //CRUD

    //adding emp
    public void addEmployee(EmployeeLinkedList employeeLinkedList){
        employeeLinkedLists.add(employeeLinkedList);
    }

    public void addEmployeeByIndex(int index,EmployeeLinkedList employeeLinkedList){
        employeeLinkedLists.add(index,employeeLinkedList);
    }

    public void addEmployeeToLast(EmployeeLinkedList employeeLinkedList){
        employeeLinkedLists.addLast(employeeLinkedList);
    }
    public void addToFirstEmp(EmployeeLinkedList employeeLinkedList){
        employeeLinkedLists.addFirst(employeeLinkedList);
    }

    //getLast
    public EmployeeLinkedList getLastEmployee(){
        return employeeLinkedLists.getLast();
    }
    public EmployeeLinkedList getFirstEmployee(){
        return employeeLinkedLists.getFirst();
    }
    public EmployeeLinkedList getLastEmployeeByIndex(int index){
        return employeeLinkedLists.get(index);
    }
    public void getAllEmp(){
        for (EmployeeLinkedList emp: employeeLinkedLists){
            System.out.println("----" + emp);
        }
    }

    //update
    public void updateEmployee(int index, EmployeeLinkedList employeeLinkedList){
        employeeLinkedLists.set(index,employeeLinkedList);
    }
    //remove / delete
    public void deleteEmp(int index){
        employeeLinkedLists.remove(index);
    }
    public int getTotal(){
        return employeeLinkedLists.size();
    }
}
