package com.myjavacourse.day10_java_collections_framework.arrayList;

public class EmployeeArrayList {
    private int id;
    private String name;
    private String department;

    public EmployeeArrayList(String department, String name, int id) {
        this.department = department;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeArrayList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
