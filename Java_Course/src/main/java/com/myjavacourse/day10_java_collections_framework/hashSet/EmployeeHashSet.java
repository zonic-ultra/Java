package com.myjavacourse.day10_java_collections_framework.hashSet;

import java.util.Objects;

public class EmployeeHashSet {
    private int id;
    private String name;
    private String department;

    public EmployeeHashSet(String department, String name, int id) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeHashSet that = (EmployeeHashSet) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }
}
