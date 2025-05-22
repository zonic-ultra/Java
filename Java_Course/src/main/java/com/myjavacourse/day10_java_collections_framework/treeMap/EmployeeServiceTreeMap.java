package com.myjavacourse.day10_java_collections_framework.treeMap;

import com.myjavacourse.day10_java_collections_framework.hashMap.EmployeeHashMap;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeServiceTreeMap {
    private TreeMap<Integer, EmployeeTreeMap> employeeTreeMap;

    public EmployeeServiceTreeMap() {
        employeeTreeMap = new TreeMap<>();
    }
    //crud

    //get first employee
    public EmployeeTreeMap getFirstEmployee(){
        return employeeTreeMap.firstEntry().getValue();
    }
    //get last emp
    public EmployeeTreeMap getLastEmployee(){
        return employeeTreeMap.lastEntry().getValue();
    }

    public EmployeeTreeMap getEmployeeByID(int id){
        return employeeTreeMap.get(id);
    }
    //add
    public EmployeeTreeMap addEmployee(EmployeeTreeMap addEmployee){
        return employeeTreeMap.put(addEmployee.getId(),addEmployee);
    }

    //remove
    public EmployeeTreeMap removeEmployeeByIdTreeMap(int id){
        return employeeTreeMap.remove(id);
    }

    //update
    public void updateEmployee(int id, String name,String department){
        if (employeeTreeMap.containsKey(id)){
            employeeTreeMap.put(id, new EmployeeTreeMap(id,name,department));
        }
    }

    //check employee exist
    public boolean hasEmployee(int id){
        return employeeTreeMap.containsKey(id);
    }

    //display
    public void displayAllEmployees(){
        for (Map.Entry<Integer,EmployeeTreeMap> entry: employeeTreeMap.entrySet()){
            System.out.println("id: " + entry.getKey() + " Value: "+ entry.getValue());
        }
    }

    //total number
    public int getTotal(){
        return employeeTreeMap.size();
    }
}
