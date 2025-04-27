package com.myjavacourse.day10_java_collections_framework.treeSet;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet>{
    private int id;
    private String name;
    private String department;

    public EmployeeTreeSet(String department, String name, int id) {
        this.department = department;
        this.name = name;
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EmployeeArrayList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(EmployeeTreeSet o) {
        return Integer.compare(this.id,o.id);
    }
}
