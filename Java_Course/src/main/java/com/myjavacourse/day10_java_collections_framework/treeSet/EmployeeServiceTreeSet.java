package com.myjavacourse.day10_java_collections_framework.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeServiceTreeSet {
    private TreeSet<EmployeeTreeSet>employeeTreeSets;

    public EmployeeServiceTreeSet() {
        employeeTreeSets = new TreeSet<>();
    }

    public EmployeeServiceTreeSet(Comparator<EmployeeTreeSet> comparator) {
        employeeTreeSets = new TreeSet<>(comparator);
    }
    //get
    public EmployeeTreeSet getFirstEmp(){
        return employeeTreeSets.getFirst();
    }
    public EmployeeTreeSet getLastEmp(){
        return employeeTreeSets.getLast();
    }
    //add object
    public boolean addEmpObject(EmployeeTreeSet addEmp){
        return employeeTreeSets.add(addEmp);
    }
    //add first
    public void addFirstEmp(EmployeeTreeSet addFirstEmp){
         employeeTreeSets.addFirst(addFirstEmp);
    }
    //add last
    public void addLastEmp(EmployeeTreeSet addLastEmp){
        employeeTreeSets.addFirst(addLastEmp);
    }
    //delete object
    public boolean removeEmpObj(EmployeeTreeSet removeEmpObj){
        return employeeTreeSets.remove(removeEmpObj);
    }
    //delete last
    public void removeFirstEmp(){
        employeeTreeSets.removeLast();
    }
    //delete first
    public void removeLastEmp(){
        employeeTreeSets.removeFirst();
    }
    public void printAllEmployees(){
        for (EmployeeTreeSet emp: employeeTreeSets){
            System.out.println("-"+emp);
        }
    }
}
