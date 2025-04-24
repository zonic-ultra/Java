package com.myjavacourse.day10_java_collections_framework.linkedList;

public class EmployeeLinkedList {
    private int employeeID;
    private String name , department;

    public EmployeeLinkedList(int employeeID, String name, String department) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "employeeID= " + employeeID +
                ", name= '" + name + '\'' +
                ", department= '" + department + '\''
                ;
    }
}
